package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.StudentVo;

public class Client {
 
   public static void main(String[] args) {
   BeanFactory factory=null;  
   MainController controller=null;
   Scanner scn=null;
   String sName=null,sAdd=null,m1=null,m2=null,m3=null;
   StudentVo vo=null;
   String result=null;
  
   
   //creat IOC container
   factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
   //get the Bean class Object
   MainController c=factory.getBean("controller",MainController.class);
   //get the value from the user
   scn=new Scanner(System.in);
   System.out.println("Enter Student Name");
   sName=scn.next();
   System.out.println("Enter Student Address");
   sAdd=scn.next();
   System.out.println("Enter Student Marks1");
   m1=scn.next();
   System.out.println("Enter Student Marks2");
   m2=scn.next();
   System.out.println("Enter Student Marks3");
   m3=scn.next();
   
   //creating vo class object
   vo=new StudentVo();
   //set values in vo class
   vo.setsName(sName);
   vo.setsAdd(sAdd);
   vo.setM1(m1);
   vo.setM2(m2);
   vo.setM3(m3);
   
   try {
	    //calling controller class method
	     result= c.handleStudent(vo);
	     System.out.println(result);
     } catch (Exception e) {
	   e.printStackTrace();
    }//catch
  }//main
}//class