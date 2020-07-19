package com.nt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component("rh")
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
