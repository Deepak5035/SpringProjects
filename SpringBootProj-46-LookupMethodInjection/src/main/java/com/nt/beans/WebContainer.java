package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("singleton")
@Component("wc")
public abstract class WebContainer {

	public static int count=0;
	
	WebContainer(){
		count++;
		System.out.println("WebContainer.WebContainer()==>::"+count);
	}
	
	@Lookup
	public abstract RequestHandler getRequestHandler();
	
	

	public void ProcessRequest(String data) {
		System.out.println("WebContainer.ProcessRequest()");

     RequestHandler rh=null;
     
     rh=getRequestHandler();
     
     rh.Request(data);
				
	}



}

