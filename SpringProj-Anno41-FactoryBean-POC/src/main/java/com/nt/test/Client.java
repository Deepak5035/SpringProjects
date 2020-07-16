package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ScheduleReminder;

public class Client {

   public static void main(String[] args) {
	 
	   ApplicationContext ctx=null;
	   ScheduleReminder sr=null;
	   
	   
	   ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 
		 sr=ctx.getBean("sr",ScheduleReminder.class);
		 
		 System.out.println(sr.reminder());
		 
		 ((AbstractApplicationContext) ctx).close();
   
   
   }



}
