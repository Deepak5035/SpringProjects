package com.nt.mobile;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MobilePhone implements ApplicationContextAware {

	ApplicationContext ctx=null;
	String beanid=null;
	
	public void setBeanid(String beanid) {
		this.beanid = beanid;
	}


	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	 this.ctx=applicationContext;			
	}
	
	
	public void gallery() {
		System.out.println("pictures");
	}
	public void phoneCalling() {
		System.out.println("number diling call goinig............");

	}

	public void charging() {
		MobilePhoneCharger charger=ctx.getBean(beanid,MobilePhoneCharger.class);	
		System.out.println(charger.charger());
	}

}
