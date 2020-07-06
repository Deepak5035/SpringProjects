package com.nt.beans;

public class WebContainer {

	RequestHandler rh;
	public static int count=0;
	
	WebContainer(){
		count++;
		System.out.println("WebContainer.WebContainer()==>::"+count);
	}

	public void setRh(RequestHandler rh) {
		this.rh = rh;
	}

	public void ProcessRequest(String data) {
		System.out.println("WebContainer.ProcessRequest()");
		rh.Request(data);
	}



}

