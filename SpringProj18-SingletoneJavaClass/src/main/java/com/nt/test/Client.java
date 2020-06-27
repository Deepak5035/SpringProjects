package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.SingletoneClass;



public class Client {
	
	public static void main(String[] args) {
			
    DefaultListableBeanFactory factory=null;
    XmlBeanDefinitionReader reader=null;
    
    
    factory=new DefaultListableBeanFactory();
    reader=new XmlBeanDefinitionReader(factory);
    reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
    
    SingletoneClass st=factory.getBean("st",SingletoneClass.class);
    System.out.println(st.hashCode());
    
    SingletoneClass st1=factory.getBean("st",SingletoneClass.class);
    System.out.println(st.hashCode());

	    
	    	
	}

}
