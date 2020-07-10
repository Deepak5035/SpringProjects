package com.nt.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateReplacer implements MethodReplacer {

	double number1=0;
	double number2=0;
	 
	public CalculateReplacer(double number1, double number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		return number1*number2;
	}

}
