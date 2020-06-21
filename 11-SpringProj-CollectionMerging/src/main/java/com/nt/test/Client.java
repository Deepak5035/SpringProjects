package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.CollegeSubject;

public class Client {
	
	public static void main(String[] args) {
     BeanFactory factory=null;
     CollegeSubject branch1=null,branch2=null;
     
     factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	 branch1=factory.getBean("ME",CollegeSubject.class);
	 System.out.println(branch1);
	 System.out.println("======================================================");
	 branch2=factory.getBean("EC",CollegeSubject.class);
	 System.out.println(branch2);
	
	}
}
