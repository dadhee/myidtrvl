package com.ga;

import com.myidtravel.login.bos.MyIDTravelLoginResponse;
import com.myidtravel.login.generated.LoginServiceNET_v40Stub;
import com.myidtravel.login.service.Login;
import com.myidtravel.login.service.LoginResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.simpleframework.http.Request;
import org.simpleframework.http.Response;
import org.simpleframework.http.core.Container;
import org.simpleframework.http.core.ContainerServer;
import org.simpleframework.transport.Server;
import org.simpleframework.transport.connect.Connection;
import org.simpleframework.transport.connect.SocketConnection;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;

import javax.xml.datatype.DatatypeConfigurationException;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author sam
 */
public class LoginClient implements Container {
    
    private final Executor executor;
    
    private static String propertiesFilePath;
    private static String axis2RepoPath;
    private static String axis2xml;
    private static String endpoint;    
    private static Properties props;    
    private static ConfigurationContext axisInstance;
    

    public LoginClient(int size)
    {
        this.executor = Executors.newFixedThreadPool(size);
    }

    public void handle(Request httpRequest, Response httpResponse)
    {
        Task task = new Task(httpRequest, httpResponse);
        executor.execute(task);
    }

    
    public static void main(String[] args) throws Exception
    {
        // init        
        if (args.length == 0)
        {
            System.out.println("Usage: java -cp %CLASSPATH% com.ga.LoginClient <PROPERTIES_FILE>");
            System.exit(0);
        }
        
        propertiesFilePath = args[0];
        props = new Properties();
        try
        {
            props.load(new FileInputStream(new File(propertiesFilePath)));
        } catch (IOException e)
        {
            props = null;
            System.out.println("Couldn't find file " + propertiesFilePath + ": " + e.getMessage());            
            System.exit(1);
        }
        axis2RepoPath = props.getProperty(LoginClientHelper.KEY_AXIS2REPO);
        axis2xml = axis2RepoPath + "/" + props.getProperty(LoginClientHelper.KEY_AXIS2XML);
        try {
            axisInstance = ConfigurationContextFactory.createConfigurationContextFromFileSystem(axis2RepoPath, axis2xml);
        } catch (AxisFault e) {
            axisInstance = null;
            System.out.println(e.getMessage());
            System.exit(1);
        }
        endpoint = props.getProperty(LoginClientHelper.KEY_ENDPOINT);        
        
        // setup listener, thread & thread pool management
        Container container = new LoginClient(10);
        Server server = new ContainerServer(container);
        Connection connection = new SocketConnection(server);
        SocketAddress address = new InetSocketAddress(8080);
        connection.connect(address);
    }
    
    
    public static class Task implements Runnable {

        private final Response httpResponse;
        private final Request httpRequest;
        

        public static LoginResponse sendRequest(Login loginRequest, String endpoint, Properties props)
        {
            LoginServiceNET_v40Stub client = null;
            try {
                client = new LoginServiceNET_v40Stub(axisInstance, endpoint);
                LoginClientHelper.checkProxyAuthentication(client._getServiceClient().getOptions(), props);
                LoginResponse response = client.login(loginRequest);
                return response;
            } catch (RemoteException e) {
                return null;                
            } finally {
                if (client != null)  {
                    try {
                        client.cleanup();
                        client._getServiceClient().cleanupTransport();
                    } catch (AxisFault e) {}
                }
            }
        }

        public Task(Request httpRequest, Response httpResponse)
        {
            this.httpResponse = httpResponse;
            this.httpRequest = httpRequest;
        }

        public void run()
        {
            String responseMsg = "";                        
            try {
                // receive request from client & compose request data for myidtravel
                Login request      = null;
                String jsonString  = this.httpRequest.getContent();                
                request            = LoginClientHelper.createRequest(jsonString);
                
                // send request to myidtravel
                LoginResponse response = sendRequest(request, endpoint, props);  
                if  (  response != null
                    && response.getReturn() != null
                    && response.getReturn().getValue() != null
                    && response.getReturn().getValue().getSuccess() != null)
                {
                    MyIDTravelLoginResponse resObj = response.getReturn().getValue();
                    this.httpResponse.setCode(200);
                    responseMsg = resObj.getUrl();                        
                }else {
                    this.httpResponse.setCode(504);
                    responseMsg = "Error during service call to Upstream Server (myidtravel)";
                }   
               
            }catch (DatatypeConfigurationException dcEx){
                this.httpResponse.setCode(400);
                responseMsg = "Bad Request: " + dcEx.getMessage();
            }catch(IOException ioEx){
                this.httpResponse.setCode(400);
                responseMsg = "Bad Request: " + ioEx.getMessage();
            }catch(JSONException jsonEx){
                this.httpResponse.setCode(400);
                responseMsg = "Bad Request: " + jsonEx.getMessage();                
            }catch(Exception e){
                this.httpResponse.setCode(500);
                responseMsg = "Server (GA-MyIDTravel Gateway) Error: " + e.getMessage();
            }
            
            // generate respond to client
            try{
                this.httpResponse.setValue("Content-Type", "text/plain");
                this.httpResponse.setValue("Server", "GA-MyIDTravel Gateway");
                PrintStream body = this.httpResponse.getPrintStream();
                body.print( responseMsg );
                body.close();
            }catch(Exception e){
                System.out.println("error: " + e.getMessage());
            }
            
        } // end of run        
    } // end of task 
    
    
}
