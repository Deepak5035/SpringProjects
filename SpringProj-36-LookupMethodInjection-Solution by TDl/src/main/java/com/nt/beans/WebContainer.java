package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {

	public static int count=0;
	
	WebContainer(){
		count++;
		System.out.println("WebContainer.WebContainer()==>::"+count);
	}

	public void ProcessRequest(String data) {
		System.out.println("WebContainer.ProcessRequest()");
		
		ApplicationContext ctx=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");;
		
		RequestHandler rh=ctx.getBean("rh",RequestHandler.class);
		
		rh.Request(data);
		
		
		
		((AbstractApplicationContext) ctx).close();
	}



}

