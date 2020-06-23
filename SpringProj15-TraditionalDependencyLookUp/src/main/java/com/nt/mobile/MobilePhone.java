package com.nt.mobile;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class MobilePhone {

	public void gallery() {
		System.out.println("pictures");
	}
	public void phoneCalling() {
		System.out.println("number diling call goinig............");

	}

	public void charging() {

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		MobilePhoneCharger charger=factory.getBean(MobilePhoneCharger.class);	
		System.out.println(charger.charger());
	}
}
