package com.nt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rh")
@Scope("prototype")
public class RequestHandler {
	
	public static int count=0;
	
	RequestHandler(){
		count++;
		System.out.println("RequestHandler--0 param constructor::"+count);
	}
	
	public void Request(String data) {
		
		System.out.println("Process Data is::"+data);
		
			
	}

}
