package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		WebContainer wb=null;
	
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	    
	    wb=ctx.getBean("wc",WebContainer.class);
	    
	    wb.ProcessRequest("My name is Deepak");
	    
	    System.out.println("===============================================");
	    
	    wb=ctx.getBean("wc",WebContainer.class);
	    
	    wb.ProcessRequest("My name is Deepak");
	    
	    

	    System.out.println("===============================================");
	    
	    wb=ctx.getBean("wc",WebContainer.class);
	    
	    wb.ProcessRequest("My name is Deepak");
	    
	    ((AbstractApplicationContext) ctx).close();
	}

}
