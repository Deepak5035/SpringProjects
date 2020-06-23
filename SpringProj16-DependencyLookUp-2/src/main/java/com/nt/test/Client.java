package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.mobile.MobilePhone;

public class Client {
	
	public static void main(String[] args) {
			
    	DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MobilePhone sr1=null;
		
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
	    sr1=factory.getBean(MobilePhone.class);
	    sr1.charging(factory,"mpc");
	    sr1.phoneCalling();
	    sr1.gallery();
	    	
	}

}
