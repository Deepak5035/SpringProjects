package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Amazon;

@SuppressWarnings("deprecation")
public class Test {
   
	public static void main(String[] args) {
		    Resource res=null;
		    BeanFactory factory=null;
		    Amazon bean=null;
		    String bill=null;
		    Scanner scn=new Scanner(System.in);
		    boolean LoginResult;
		   
         //configuration file
         res= new ClassPathResource("com/nt/cfgs/applicationContext.xml");
         factory=new XmlBeanFactory(res);
         bean=factory.getBean("amz",Amazon.class);
         System.out.println("Enter username");
         String username=scn.nextLine();
         System.out.println("Enter Password");
         String password=scn.nextLine();
         LoginResult=bean.loginDetails(username,password);
         if(LoginResult) {
         System.out.println("List of items you can Purchase \n Moible \n TV \n Watch \n Laptop \n Book \n Pen");
         System.out.println("Enter the item for Purchase");
         String []s =new String[4];
         for(int i=0;i<=s.length-1;i++) {
        	 s[i]=scn.nextLine();
         }
         
         bill =bean.purchase(s,new double[] {1500.0,120000.0,40000.0,25000.0});
         System.out.println(bill);
         }else {
        	 System.out.println("Enter Correct Details");
         }

	}
}
