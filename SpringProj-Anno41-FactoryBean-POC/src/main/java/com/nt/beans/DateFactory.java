package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@SuppressWarnings("deprecation")
@Component("df")
public class DateFactory implements FactoryBean<Date> {
     
	@Value("1994")
	private int year;
	@Value("11")
	private int month;
	@Value("12")
	private int date;
	
	DateFactory(){
		System.out.println("DateFactory.DateFactory()");
	}
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	
	public Date getObject() throws Exception {
		
		System.out.println("DateFactory.getObject()");
		return new Date(year-1900,month-1,date);
	}

	public Class<?> getObjectType() {
		System.out.println("DateFactory.getObjectType()");
		return Date.class;
	}
   public boolean isSingleton() {
	   System.out.println("DateFactory.isSingleton()");
	return true;
  }
}
