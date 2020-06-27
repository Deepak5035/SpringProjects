package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.TravelAgent;

public class Client {

	
	
	public static void main(String[] args) {
		
    DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
		
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	
	TravelAgent ta=factory.getBean("ta",TravelAgent.class);
	System.out.println(ta.destinationPrice(2));

	}
	
}
