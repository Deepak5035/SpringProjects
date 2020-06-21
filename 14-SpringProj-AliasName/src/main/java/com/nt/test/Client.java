package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.student.StudentRegistration;

public class Client {
	
	public static void main(String[] args) {
			
    	DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		StudentRegistration sr1=null,sr2=null,sr3=null;
		
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
	    sr1=factory.getBean("student1",StudentRegistration.class);
	    System.out.println(sr1);
		System.out.println("==============================================================================");
		sr2=factory.getBean("stu1",StudentRegistration.class);
		System.out.println(sr2);
		System.out.println("==============================================================================");
		sr3=factory.getBean("Deepak",StudentRegistration.class);
		System.out.println(sr3);
		System.out.println("==============================================================================");
		sr2=factory.getBean("sr",StudentRegistration.class);
		System.out.println(sr2);
		System.out.println("==============================================================================");
		sr2=factory.getBean("dResgister",StudentRegistration.class);
		System.out.println(sr2);
	  
	
	
	}

}
