/**
 * 
 */
package com.ga;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class WSTraceHandler.
 *
 * @author Jens Willhardt
 */
public class LoginClientLogHandler extends AbstractHandler {

	// private static final Logger LOG = Logger.getLogger(LoginClientLogHandler.class);
	
	/* (non-Javadoc)
	 * @see org.apache.axis2.engine.Handler#invoke(org.apache.axis2.context.MessageContext)
	 */
	public InvocationResponse invoke(MessageContext msgContext) throws AxisFault {
		String logPrefix = null;
		switch (msgContext.getFLOW()) {
			case MessageContext.IN_FLOW:
			case MessageContext.IN_FAULT_FLOW:
				logPrefix = "Response: ";
				break;
			case MessageContext.OUT_FLOW:
			case MessageContext.OUT_FAULT_FLOW:
				logPrefix = "Request: ";
				break;
		};
		
		//if(LOG.isInfoEnabled()) {
			// log trace
			// LOG.info(logPrefix + msgContext.getEnvelope().cloneOMElement().toString().replaceAll("[\\n\\r]", ""));
		//}
		return InvocationResponse.CONTINUE;
	}
}
