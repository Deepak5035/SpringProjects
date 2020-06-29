package com.nt.servlet;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterDetails implements InitializingBean,DisposableBean {

String name;
int age;
String add;


public VoterDetails() {

	System.out.println("VoterDetails.)0->param");

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}

public String CheckVotingEligibility() {
	
	if(age<18) {
		return  "not eligible";
	}
	else
		return "eligibal";
	
}


@Override
public String toString() {
	System.out.println("VoterDetails.toString()");
	return "VoterDetails [name=" + name + ", age=" + age + ", add=" + add + "]";
}
@Override
public void destroy() throws Exception {
	System.out.println("VoterDetails.destroy()");
	//nullify bean
	VoterDetails vd=null;
	
}
@Override
public void afterPropertiesSet() throws Exception {
	
	System.out.println("VoterDetails.afterPropertiesSet()");
	
	if(age<0)
	age=age*-1;
	
	if(age<2 || name==null) {
		throw new IllegalArgumentException("invaild age or name");
	}
}


		
}
