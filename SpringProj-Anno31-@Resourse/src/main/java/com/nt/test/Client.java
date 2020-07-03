package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.TravelAgent;

public class Client {

	
	
	public static void main(String[] args) {

		ApplicationContext ctx=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		
		TravelAgent ta=ctx.getBean("ta",TravelAgent.class);
	    System.out.println(ta.destinationPrice(2));
        
	    ((AbstractApplicationContext) ctx).close();
	}
	
}
