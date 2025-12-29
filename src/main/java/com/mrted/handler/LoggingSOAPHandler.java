package com.mrted.handler;

import java.io.PrintStream;
import java.util.Set;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


import javax.xml.namespace.QName;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class LoggingSOAPHandler implements SOAPHandler<SOAPMessageContext> {

	public static final String WSSE_NS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	public static final String PASSWORD_TEXT_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";
	public static final String WSSE_SECURITY_LNAME = "Security";
	public static final String WSSE_NS_PREFIX = "wsse";

    private String username="DHL:bo_bundle_oracleint:BO";
    private String password="oracleint1";
    
	private boolean mustUnderstand = false;

	public boolean handleMessage(SOAPMessageContext messageContext) {
	    Object bOutbound = messageContext.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
	    if (bOutbound == Boolean.TRUE) {
	        try {
	            if (username != null && username.length() != 0) {
	                addSecurityHeader(messageContext);
	              //  System.out.println("Added security header");
	            } else {
	                //System.out.println("No username configured thus not adding a security header");
	            }
	        } catch (Exception e) {
	            System.out.println("Exception in handleMessage"+ e);
	            return false;
	        }
	        PrintStream out=System.out;
	         SOAPMessage message = messageContext.getMessage();
        try {
          // message.writeTo(out);
          // out.println();
        } catch (Exception e) {
            out.println("Exception in handler: " + e);
        }
        
	    }
	    return true;
	}

	private void addSecurityHeader(SOAPMessageContext messageContext) throws SOAPException {
	    SOAPFactory sf = SOAPFactory.newInstance();
	    SOAPHeader header = messageContext.getMessage().getSOAPPart().getEnvelope().getHeader();
	    if (header == null) {
	        header = messageContext.getMessage().getSOAPPart().getEnvelope().addHeader();
	    }

	    Name securityName = sf.createName(WSSE_SECURITY_LNAME, WSSE_NS_PREFIX, WSSE_NS);
	    SOAPHeaderElement securityElem = header.addHeaderElement(securityName);
	    securityElem.setMustUnderstand(mustUnderstand);

	    Name usernameTokenName = sf.createName("UsernameToken", WSSE_NS_PREFIX, WSSE_NS);
	    SOAPElement usernameTokenMsgElem = sf.createElement(usernameTokenName);

	    Name usernameName = sf.createName("Username", WSSE_NS_PREFIX, WSSE_NS);
	    SOAPElement usernameMsgElem = sf.createElement(usernameName);
	    usernameMsgElem.addTextNode(username);
	    usernameTokenMsgElem.addChildElement(usernameMsgElem);

	    Name passwordName = sf.createName("Type", WSSE_NS_PREFIX, WSSE_NS);
	    SOAPElement passwordMsgElem = sf.createElement("Password", WSSE_NS_PREFIX, WSSE_NS);

	    passwordMsgElem.addAttribute(passwordName, PASSWORD_TEXT_TYPE);
	    passwordMsgElem.addTextNode(password);
	    usernameTokenMsgElem.addChildElement(passwordMsgElem);

	    securityElem.addChildElement(usernameTokenMsgElem);
	}

	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}
}