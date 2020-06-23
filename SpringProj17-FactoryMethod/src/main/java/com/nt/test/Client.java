package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;



public class Client {
	
	public static void main(String[] args) {
			
    DefaultListableBeanFactory factory=null;
    XmlBeanDefinitionReader reader=null;
    
    
    factory=new DefaultListableBeanFactory();
    reader=new XmlBeanDefinitionReader(factory);
    reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
    
    Class s1=factory.getBean("c1",Class.class);
    System.out.println(s1);
    
    String s2=factory.getBean("s1",String.class);
    System.out.println(s2);
    
    String s3=factory.getBean("s2",String.class);
    System.out.println(s3);
    
    StringBuffer sb1=factory.getBean("sb1",StringBuffer.class);
    System.out.println(sb1);
    
    StringBuffer sb2=factory.getBean("sb2",StringBuffer.class);
    System.out.println(sb2);
		
	    
	    	
	}

}
