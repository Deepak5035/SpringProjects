package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactory implements FactoryBean<Date> {

	private int year;
	private int month;
	private int date;
	
	DateFactory(){
		System.out.println("DateFactory.DateFactory()");
	}
	
	
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
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
