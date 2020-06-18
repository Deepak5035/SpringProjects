package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.bean.WishGenerator;

@SuppressWarnings("deprecation")
public class ClientApp {

	public static void main(String[] args) {
		
		BeanFactory factory=null;
		FileSystemResource res=null;
		System.out.println("ClientApp main(-)");
		
		//Locate Spring Bean configuration file
		 res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		//Activate Bean Factory Container
		 factory=new XmlBeanFactory(res);
		
		//create bean class object
		Object obj=factory.getBean("wmg");
		
		//call B.Method
		WishGenerator result=(WishGenerator)obj;
		
		System.out.println(result.generatorWishMsg("deepak"));

	}//main

}//class
