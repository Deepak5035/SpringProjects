package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.bean.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class ClientApp {

	public static void main(String[] args) {
		System.out.println("start clientApp main");
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		//locate cfg file
		//res=new FileSystemResource("src/com/nt/cfg/ApplicationContext.cfg.xml");
        res=new ClassPathResource("com/nt/cfg/ApplicationContext.cfg.xml");
		//create IOC container

		factory=new XmlBeanFactory(res);
		//getting Target class Object
		obj=factory.getBean("wmg");

		//Type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;

		//Execute B.logic Method from target Class object
		System.out.print(generator.MessageGenerator("Deepak"));
	}

}
