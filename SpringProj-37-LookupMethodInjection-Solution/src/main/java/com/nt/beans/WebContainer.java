package com.nt.beans;

public abstract class WebContainer {

	public static int count=0;
	
	WebContainer(){
		count++;
		System.out.println("WebContainer.WebContainer()==>::"+count);
	}
	
	public abstract RequestHandler getRequestHandler();
	
	

	public void ProcessRequest(String data) {
		System.out.println("WebContainer.ProcessRequest()");

     RequestHandler rh=null;
     
     rh=getRequestHandler();
     
     rh.Request(data);
				
	}



}

