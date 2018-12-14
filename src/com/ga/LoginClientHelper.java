/**
 * 
 */
package com.ga;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Random;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HttpTransportProperties;

import org.json.JSONObject;
import org.json.JSONArray;

import com.myidtravel.login.bos.Accounting;
import com.myidtravel.login.bos.Booking;
import com.myidtravel.login.bos.Category;
import com.myidtravel.login.bos.Contact;
import com.myidtravel.login.bos.Employee;
import com.myidtravel.login.bos.Employment;
import com.myidtravel.login.bos.EmploymentStatus;
import com.myidtravel.login.bos.EntitledPerson;
import com.myidtravel.login.bos.LaborGroup;
import com.myidtravel.login.bos.LockDate;
import com.myidtravel.login.bos.PTCAllotment;
import com.myidtravel.login.bos.MasterAccess;
import com.myidtravel.login.bos.MasterAccessRole;
import com.myidtravel.login.bos.DutyTravel;
import com.myidtravel.login.bos.LeisureTravel;
import com.myidtravel.login.bos.MyIDTravelLoginRequest;
import com.myidtravel.login.bos.OpMode;
import com.myidtravel.login.bos.RouteInfo;
import com.myidtravel.login.bos.Flight;
import com.myidtravel.login.bos.Salutation;
import com.myidtravel.login.service.Login;
import com.myidtravel.login.service.ObjectFactory;


// TODO: Auto-generated Javadoc
/**
 * The Class LoginClientHelper.
 * 
 * @author u200020
 */
public class LoginClientHelper {

	/** The Constant KEY_ENDPOINT. */
	public static final String KEY_ENDPOINT = "endpoint";

	/** The Constant KEY_AXIS2XML. */
	public static final String KEY_AXIS2XML = "axis2.xml";

	/** The Constant KEY_AXIS2REPO. */
	public static final String KEY_AXIS2REPO = "axis2.repoPath";
	
	/** The Constant KEY_PROXYIP. */
	public static final String KEY_PROXYIP   = "proxy.nameip";
	
	/** The Constant KEY_PROXYUSER. */
	public static final String KEY_PROXYUSER = "proxy.user";
	
	/** The Constant KEY_PROXYPASS. */
	public static final String KEY_PROXYPASS = "proxy.password";
	
	/** The Constant KEY_PROXYPORT. */
	public static final String KEY_PROXYPORT = "proxy.port";


	/**
	 * Creates the request.
	 *
	 * @return the my id travel login request
	 * @throws DatatypeConfigurationException the datatype configuration exception
	 */
	public static Login createRequest( String jsonString ) throws DatatypeConfigurationException 
        {
            // prepare object used
            Login loginRequest          = new Login();
            MyIDTravelLoginRequest req  = new MyIDTravelLoginRequest();
            JSONObject json_data        = new JSONObject( jsonString );          
            
            try{
                // mandatory attributes (ac,opMode)
                if (    !json_data.has("ac")        || json_data.isNull("ac") 
                   ||   !json_data.has("opmode")    || json_data.isNull("opmode")  )
                { 
                    throw new DatatypeConfigurationException();
                }
                req.setAc( json_data.getString("ac") );
                req.setOpMode( OpMode.fromValue( json_data.getString("opmode") ) ); 

                // optional attribute (aID,prefLanguage,action) 
                if ( json_data.has("aid") ) {
                    req.setAID( BigInteger.valueOf( json_data.getLong("aid") ) );
                }            
                if ( json_data.has("preflanguage") ) {
                    req.setPrefLanguage( json_data.getString("preflanguage") );
                }             
                if ( json_data.has("action") ) {
                    req.setAction( json_data.getString("action") );
                }


                //  employee elemen (mandatory)  
                if ( !json_data.has("employee") || json_data.isNull("employee") ){
                    throw new DatatypeConfigurationException();
                }
                JSONObject json_employee  = json_data.getJSONObject("employee");                        
                Employee employee = new Employee();                            
                    // mandatory attribute of employee: ptc,lastname,firstname
                    if (    !json_employee.has("ptc")       || json_employee.isNull("ptc") 
                       ||   !json_employee.has("firstname") || json_employee.isNull("firstname") 
                       ||   !json_employee.has("lastname")  || json_employee.isNull("lastname")  )
                    { 
                         throw new DatatypeConfigurationException();
                    }
                    employee.setPtc( json_employee.getString("ptc") );
                    employee.setFirstname( json_employee.getString("firstname") );
                    employee.setLastname( json_employee.getString("lastname") );

                    // optional attribute of employee: middlename,salutation,dob,dhc,currency,countryOfRes,Extension
                    if ( json_employee.has("middlename") ) {
                        employee.setMiddlename( json_employee.getString("middlename") );
                    }                
                    if ( json_employee.has("salutation") ){
                        employee.setSalutation( Salutation.fromValue(json_employee.getString("salutation")) );
                    }
                    if ( json_employee.has("dob") ){
                        String[] arrdob = json_employee.getString("dob").split("\\.");
                        employee.setDob( DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar( 
                            Integer.parseInt(arrdob[0]), 
                            Integer.parseInt(arrdob[1]), 
                            Integer.parseInt(arrdob[2])  
                        )));
                    }
                    if ( json_employee.has("dhc") ){
                        employee.setDhc( json_employee.getBoolean("dhc") );
                    }
                    if ( json_employee.has("currency") ){
                        employee.setCurrency( json_employee.getString("currency") );
                    }
                    if ( json_employee.has("countryofres")) {
                        employee.setCountryOfRes( json_employee.getString("countryofres") );
                    }
                    if ( json_employee.has("extension") ) {
                        employee.setExtension( json_employee.getString("extension"));
                    }
                    req.setEmployee(employee);


                    // Employment Element (mandatory)
                    if ( !json_employee.has("employment") || json_employee.isNull("employment") ){
                        throw new DatatypeConfigurationException();
                    }
                    JSONObject json_employment = json_employee.getJSONObject("employment"); 
                    Employment employment = new Employment();
                        // mandatory attribute of Employment: eID, doj
                        if (    !json_employment.has("eid") || json_employment.isNull("eid") 
                           ||   !json_employment.has("doj") || json_employment.isNull("doj")  )
                        { 
                             throw new DatatypeConfigurationException();
                        }
                        employment.setEID( json_employment.getString("eid") );
                        String[] arrdoj =  json_employment.getString("doj").split("\\.");            
                        employment.setDoj( DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar( 
                                    Integer.parseInt(arrdoj[0]), 
                                    Integer.parseInt(arrdoj[1]), 
                                    Integer.parseInt(arrdoj[2])  
                        )));            

                        // optional attribute of Employment: secondaryID, departemen, subCategory, subCompany, dot, employmentStatus, laborGroup, oalTravelEligible
                        if ( json_employment.has("secondaryid") ) {
                            employment.setSecondaryID( json_employment.getString("secondaryid") );
                        }                    
                        if ( json_employment.has("departemen") ) {
                            employment.setDepartment( json_employment.getString("departemen") );
                        }                    
                        if ( json_employment.has("subcategory") ) {
                            employment.setSubCategory( Category.fromValue( json_employment.getString("subcategory") ) );            
                        }                    
                        if ( json_employment.has("subcompany") ) {
                            employment.setSubCompany( json_employment.getString("subcompany") );            
                        }                                        
                        if ( json_employment.has("dot") ){
                            String[] arrdot = json_employment.getString("dot").split("\\.");                        
                            employment.setDot( DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar( 
                                Integer.parseInt(arrdot[0]), 
                                Integer.parseInt(arrdot[1]), 
                                Integer.parseInt(arrdot[2])  
                            )));
                        }                    
                        if ( json_employment.has("employmentstatus") ) {                        
                            employment.setEmploymentStatus( EmploymentStatus.fromValue(json_employment.getString("employmentstatus")) );  
                        }                          
                        if ( json_employment.has("laborgroup") ) {  
                            employment.setLaborGroup( LaborGroup.fromValue(json_employment.getString("laborgroup")) );
                        }                          
                        if ( json_employment.has("oaltraveleligible") ) {  
                            employment.setOalTravelEligible(json_employment.getBoolean("oaltraveleligible"));
                        }                          
                        employee.setEmployment(employment);


                    // Accounting Element (optional)
                    if ( json_employee.has("accounting") ){
                        JSONObject json_accounting = json_employee.getJSONObject("accounting");                    
                        Accounting accounting = new Accounting();
                        if ( json_accounting.has("costcenter") ){
                            accounting.setCostCenter( json_accounting.getString("costcenter") );                        
                        }
                        if ( json_accounting.has("setofbooks") ){
                            accounting.setSetOfBooks( json_accounting.getString("setofbooks") );
                        }
                        if ( json_accounting.has("salarydeduction") ){
                            accounting.setSalaryDeduction( json_accounting.getBoolean("salarydeduction")   );
                        }
                        if ( json_accounting.has("employeebenefittaxable") ){
                            accounting.setEmployeeBenefitTaxable( json_accounting.getBoolean("employeebenefittaxable"));
                        }
                        employee.setAccounting(accounting);                      
                    }

                    // Contact Element (optional)
                    if ( json_employee.has("contact") ){
                        JSONObject json_contact    = json_employee.getJSONObject("contact");                         
                        Contact contact = new Contact();
                        if ( json_contact.has("email") ){
                            contact.setEmailAddress( json_contact.getString("email"));
                        }
                        if ( json_contact.has("phone1") ){
                            contact.setPhone1( json_contact.getString("phone1") );
                        }
                        if ( json_contact.has("phone2") ){
                            contact.setPhone1( json_contact.getString("phone2") );
                        }
                        employee.setContact(contact);
                    }


                    // lock-date element (optional)
                    if ( json_employee.has("lock-date") ){
                        JSONArray json_lockdate = json_employee.getJSONArray("lock-date");
                        for(int i=0; i < json_lockdate.length(); i++)
                        {                
                            JSONObject json_lockdate_el = json_lockdate.getJSONObject(i);
                            LockDate lockDate = new LockDate();

                            String[] arr_startdate = json_lockdate_el.getString("from").split("\\.");
                            XMLGregorianCalendar startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(
                                    Integer.parseInt( arr_startdate[0] ), 
                                    Integer.parseInt( arr_startdate[1] ), 
                                    Integer.parseInt( arr_startdate[2] )
                            ));
                            lockDate.setStartDate(startDate);

                            if ( json_lockdate_el.has("until")  ){
                                String[] arr_enddate   = json_lockdate_el.getString("until").split("\\.");
                                XMLGregorianCalendar endDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(
                                        Integer.parseInt( arr_enddate[0] ), 
                                        Integer.parseInt( arr_enddate[1] ), 
                                        Integer.parseInt( arr_enddate[2] )
                                ));
                                lockDate.setEndDate(endDate);
                            }
                            employee.getLockDate().add(lockDate);
                        }                       
                    }


                    // ptc-allotment element (optional)
                    if ( json_employee.has("ptc-allotment") ){
                        JSONArray json_ptcAllotment = json_employee.getJSONArray("ptc-allotment");
                        for(int i=0; i < json_ptcAllotment.length(); i++)
                        {                
                            JSONObject  json_ptcAllotment_el = json_ptcAllotment.getJSONObject(i);                        
                            PTCAllotment ptcAllotment = new PTCAllotment();
                            ptcAllotment.setPtc( json_ptcAllotment_el.getString("ptc") );
                            ptcAllotment.setCounter( json_ptcAllotment_el.getString("counter") );
                            employee.getPtcAllotment().add(ptcAllotment);
                        }
                    }                

                    // entitled-person element (optional)
                    if ( json_employee.has("entitled-person") ){
                        JSONArray  json_entitled   = json_employee.getJSONArray("entitled-person");
                        for(int i=0; i < json_entitled.length(); i++)
                        { 
                            JSONObject json_entitled_el = json_entitled.getJSONObject(i);
                            EntitledPerson entitled = new EntitledPerson();

                            entitled.setFirstname( json_entitled_el.getString("firstname") );      
                            entitled.setLastname( json_entitled_el.getString("lastname") );
                            entitled.setPtc( json_entitled_el.getString("ptc") );

                            if ( json_entitled_el.has("middlename") ){
                                entitled.setMiddlename( json_entitled_el.getString("middlename") );
                            }
                            if ( json_entitled_el.has("salutation") ){
                                entitled.setSalutation( Salutation.fromValue( json_entitled_el.getString("salutation") ) );
                            }
                            if ( json_entitled_el.has("dob") ){
                                String[] arrdob = json_entitled_el.getString("dob").split("\\.");
                                entitled.setDob( DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(
                                            Integer.parseInt( arrdob[0] ), 
                                            Integer.parseInt( arrdob[1] ), 
                                            Integer.parseInt( arrdob[2] )
                                )));
                            }
                            if ( json_entitled_el.has("taxdependant") ){
                                entitled.setTaxDependant( json_entitled_el.getBoolean("taxdependant")  );
                            }
                            if ( json_entitled_el.has("extension") ){
                                entitled.setExtension( json_entitled_el.getString("extension") );
                            }

                            employee.getEntitledPerson().add(entitled);
                        }
                    }

                // master-access element (optional)
                if ( json_data.has("master-access") ){
                    JSONObject json_masteraccess = json_data.getJSONObject("master-access");  
                    MasterAccess masterAccess = new MasterAccess();

                    masterAccess.setIsMasterAccess( json_masteraccess.getBoolean("ismasteraccess") );
                    if ( json_masteraccess.has("masteruserid") ){
                        masterAccess.setMasterUserID( json_masteraccess.getString("masteruserid") );
                    }
                    if ( json_masteraccess.has("firstname") ){
                        masterAccess.setFirstName( json_masteraccess.getString("firstname") );
                    }
                    if ( json_masteraccess.has("lastname") ){
                        masterAccess.setLastName( json_masteraccess.getString("lastname") );
                    }
                    if ( json_masteraccess.has("role") ){
                        masterAccess.setRole( MasterAccessRole.fromValue(json_masteraccess.getString("role")) );
                    }
                    if ( json_masteraccess.has("roles") ){
                        JSONArray json_roles = json_masteraccess.getJSONArray("roles");
                        for(int i=0; i < json_roles.length(); i++){
                            masterAccess.getRoles().add( json_roles.getString(i) );
                        }
                    }                
                    if ( json_masteraccess.has("extension") ){
                        masterAccess.setExtension( json_masteraccess.getString("extension") );
                    }
                    req.setMasterAccess(masterAccess);                
                }


                // dutyTravel element (optional)
                if ( json_data.has("dutytravel") ){
                    JSONObject json_dutyTravel   = json_data.getJSONObject("dutytravel");
                    DutyTravel dutyTravel = new DutyTravel();

                    if ( json_dutyTravel.has("dutyserviceclass") ){
                        dutyTravel.setDutyServiceClass( json_dutyTravel.getString("dutyserviceclass") );
                    }
                    if ( json_dutyTravel.has("dutypriority") ){
                        dutyTravel.setDutyPriority( json_dutyTravel.getString("dutypriority") );
                    }
                    if ( json_dutyTravel.has("paymentaccount") ){
                        dutyTravel.setPaymentAccount( json_dutyTravel.getString("paymentaccount") );                    
                    }
                    if ( json_dutyTravel.has("travelorder")){
                        dutyTravel.setTravelOrder( json_dutyTravel.getString("travelorder") );
                    }
                    if ( json_dutyTravel.has("eligibleforairlines")){  
                        JSONArray json_eligibleForAirlines = json_dutyTravel.getJSONArray("eligibleforairlines");
                        for(int i=0; i< json_eligibleForAirlines.length(); i++) {
                            dutyTravel.getEligibleForAirlines().getAirline().add( json_eligibleForAirlines.getString(i) );
                        }
                    }
                    
                    req.setDutyTravel( dutyTravel );

                }

                // leisureTravel element (optional)
                if ( json_data.has("leisuretravel") ){
                    JSONObject json_leisureTravel= json_data.getJSONObject("leisuretravel");
                    LeisureTravel leisureTravel = new LeisureTravel();

                    if ( json_leisureTravel.has("leisurepriority")){
                        leisureTravel.setLeisurePriority( json_leisureTravel.getString( "leisurepriority" ) );                    
                    }
                    if ( json_leisureTravel.has("eligibleforairlines")){  
                        JSONArray json_eligibleForAirlines = json_leisureTravel.getJSONArray("eligibleforairlines");
                        for(int i=0; i< json_eligibleForAirlines.length(); i++) {
                            leisureTravel.getEligibleForAirlines().getAirline().add( json_eligibleForAirlines.getString(i) );
                        }
                    }       
                    req.setLeisureTravel( leisureTravel );
                }


                // booking element (optional)
                if ( json_data.has("booking") ){
                    JSONObject json_booking = json_data.getJSONObject("booking");
                    Booking booking = new Booking();

                    if ( json_booking.has("uniqueid")){                    
                        booking.setUniqueID( json_booking.getString( "uniqueid" ) );
                    }
                    if ( json_booking.has("ticketnumber")){
                        booking.setTicketNumber( json_booking.getString( "ticketnumber" ) );
                    }
                    if ( json_booking.has("airlinecode")){
                        booking.setAirlineCode( json_booking.getString( "airlinecode" ) );
                    }
                    if ( json_booking.has("lastname")){
                        booking.setLastname( json_booking.getString( "lastname" ) );
                    }
                    req.setBooking(booking);
                }


                // routeInfo element (optional)
                if ( json_data.has("routeinfo") ){                
                    JSONArray  json_routeInfo    = json_data.getJSONArray("routeinfo");                                 
                    for(int i=0; i< json_routeInfo.length(); i++) 
                    {
                        JSONObject json_routeInfo_el = json_routeInfo.getJSONObject(i);
                        RouteInfo routeInfo = new RouteInfo();

                        routeInfo.setOrigin( json_routeInfo_el.getString("origin") );                    
                        routeInfo.setDestination( json_routeInfo_el.getString("destination") );                    
                        routeInfo.setDate(json_routeInfo_el.getString("date"));                    
                        routeInfo.setMonth(json_routeInfo_el.getString("month"));

                        if ( json_routeInfo_el.has("airlinecode") ){
                            routeInfo.setAirlineCode( json_routeInfo_el.getString("airlinecode") );
                        }
                        if ( json_routeInfo_el.has("compartment") ){
                            routeInfo.setCompartment( json_routeInfo_el.getString("compartment") );
                        }
                        if ( json_routeInfo_el.has("time") ){
                            routeInfo.setTime( json_routeInfo_el.getString("time") );
                        }
                        if ( json_routeInfo_el.has("travelstatus") ){
                            routeInfo.setTravelStatus( json_routeInfo_el.getString("travelstatus") );
                        }

                        if ( json_routeInfo_el.has("selectedflight") ){
                            JSONObject json_selectedFlight =   json_routeInfo_el.getJSONObject("selectedflight");                        
                            Flight flight = new Flight();

                            flight.setFlightNumber( json_selectedFlight.getString("flightnumber")  );
                            flight.setAirlineCode( json_selectedFlight.getString("airlinecode")  );
                            routeInfo.setSelectedFlight(flight);                        
                        }                    

                        req.getRouteInfo().add(routeInfo);
                    }
                }                
                // set myidtravel login request in login
                loginRequest.setLogin(new ObjectFactory().createLoginLogin(req));
                return loginRequest;

            }catch(Exception e){
                System.out.println(e.getMessage());
                return null;
            }

	} // end of createRequest
        
        
        
	/**
	 * Use proxy authentication.
	 *
	 * @param opts the opts
	 * @param proxyName the proxy name
	 * @param proxyPort the proxy port
	 * @param proxyUser the proxy user
	 * @param proxyPass the proxy pass
	 */
	public static void checkProxyAuthentication(Options opts, Properties props) {
		String ip = props.getProperty(KEY_PROXYIP, "").trim();
		if(ip.length() > 0) {
			// settings for authenticating proxy
		    HttpTransportProperties.ProxyProperties proxyProperties = new HttpTransportProperties.ProxyProperties();
		    proxyProperties.setProxyName(ip);
		    proxyProperties.setProxyPort(Integer.parseInt(props.getProperty(KEY_PROXYPORT)));
		    // enter your username and password for authenticating proxy here
		    proxyProperties.setUserName(props.getProperty(KEY_PROXYUSER));
		    proxyProperties.setPassWord(props.getProperty(KEY_PROXYPASS));
		    
		    opts.setProperty(org.apache.axis2.transport.http.HTTPConstants.PROXY, proxyProperties);
		}
	}
    
}
