package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.student.StudentRegistration;

public class Client {
	
	public static void main(String[] args) {
		
		
		/*BeanFactory factory=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		StudentRegistration sr1=null,sr2=null;
		
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		*/		
		
		
	
    	DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		StudentRegistration sr1=null,sr2=null;
		
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
	    sr1=factory.getBean(StudentRegistration.class);
	    System.out.println(sr1);
		System.out.println("==============================================================================");
		sr2=factory.getBean(StudentRegistration.class);
		System.out.println(sr2);
	
	
	
	}

}
