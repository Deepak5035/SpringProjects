package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.student.StudentRegistration;

public class Client {
	
	public static void main(String[] args) {
		BeanFactory factory=null;
		StudentRegistration sr1=null,sr2=null;
		factory=new XmlBeanFactory(new ClassPathResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		sr1=factory.getBean("stu",StudentRegistration.class);
		System.out.println(sr1);	
	    
	}

}
