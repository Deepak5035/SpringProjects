package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Amazon;

public class Test {
	public static void main(String[] args) {
         Resource res=null;
         BeanFactory factory=null;
         Amazon bean=null;
         String bill=null;
         
         //locate spring bean configuration file
         res= new ClassPathResource("com/nt/cfgs/applicationContext.xml");
         
         //Create IOC container
         factory=new XmlBeanFactory(res);
         
         //getting bean class Object
         bean=factory.getBean("amz",Amazon.class);
         
         //calling B.logic
         bill =bean.purchase(new String[] {"Tv","mobile"},new double[] {20000.0,12000.0});
         System.out.println(bill);	
	
	
	
	}
}
