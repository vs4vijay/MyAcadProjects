package com.metagurukul.metaboard.unittest;

import java.io.File;

import com.metagurukul.metaboard.action.PostAction;

import junit.framework.*;
import servletunit.struts.MockStrutsTestCase;

import org.*;
public class ShowActionTestCase extends MockStrutsTestCase{
	
	  
	  public ShowActionTestCase(String testName) { super(testName); }

	    public void testShowAction() 
	    {
	    	setContextDirectory(new File("WebContent"));
	    	
	    	addRequestParameter("notificationID","1");
	    	addRequestParameter("creatorID","1");
	    	addRequestParameter("sectionID","1");
	    	addRequestParameter("archived","1");
	    	addRequestParameter("groupID","1");
	    	addRequestParameter("title","java");
	    	addRequestParameter("description","add");
	    	addRequestParameter("postedTime","2012-12-12 11:11:11");
	    	addRequestParameter("expiryDate","2012-12-12 11:11:11");
	        setRequestPathInfo("/showAction");
	        actionPerform();
	        verifyForwardPath("/error.jsp");
	    }

}
