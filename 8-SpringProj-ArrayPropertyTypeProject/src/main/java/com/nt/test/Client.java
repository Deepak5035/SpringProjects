package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.student;

public class Client {
	public static void main(String[] args) {
        BeanFactory factory=null;
        student stu=null;
        
        factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
        stu=factory.getBean("stu",student.class);
        
        System.out.println(stu.toString());
        
	}
}
