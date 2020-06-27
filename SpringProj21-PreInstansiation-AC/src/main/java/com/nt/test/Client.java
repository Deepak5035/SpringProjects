package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.student.StudentRegistration;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentRegistration sr1=null,sr2=null;
		ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		/*sr1=ctx.getBean("stu",StudentRegistration.class);
		System.out.println(sr1)*/;	
	    ((AbstractApplicationContext) ctx).close();
	}

}
