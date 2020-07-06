package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.mobile.MobilePhone;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
        MobilePhone sr1=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

	    sr1=ctx.getBean("mp",MobilePhone.class);
	    sr1.charging();
	    sr1.phoneCalling();
	    sr1.gallery();
	    
	    ((AbstractApplicationContext) ctx).close();
	    	
	}

}
