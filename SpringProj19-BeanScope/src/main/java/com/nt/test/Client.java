package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.CricektVO;
import com.nt.beans.CricketActivity;
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

    System.out.println("=======================================================");
    
    CricketActivity ca=factory.getBean("ca",CricketActivity.class);
    System.out.println(ca.hashCode());
    CricketActivity ca1=factory.getBean("ca",CricketActivity.class);
    System.out.println(ca1.hashCode());
    System.out.println("==========================================================");
    
    CricektVO cv =factory.getBean("cv",CricektVO.class);
    System.out.println(cv.hashCode());
    CricektVO cv1 =factory.getBean("cv",CricektVO.class);
    System.out.println(cv1.hashCode());
	    
	    	
	}

}
