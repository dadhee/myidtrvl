/**
 *
 */
package com.ga;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginClientPWCBHandler.
 *
 * @author U200020
 */
public class LoginClientPWCBHandler implements CallbackHandler {

    /* (non-Javadoc)
     * @see javax.security.auth.callback.CallbackHandler#handle(javax.security.auth.callback.Callback[])
     */
    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException
    {

        for (int i = 0; i < callbacks.length; i++)
        {
            WSPasswordCallback pwcb = (WSPasswordCallback) callbacks[i];
            String id = pwcb.getIdentifer();

            // set private key password for alias
            if ("client".equals(id)) {
                pwcb.setPassword("apache");
            } else if ("service".equals(id)) {
                pwcb.setPassword("apache");
            } else if ("ga".equals(id)) {
                pwcb.setPassword("6kGAt8");
            }

        }
    }
}
