package com.nt.servlet;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class VoterDetails{


String name;
int age;
String add;


public VoterDetails() {

	System.out.println("VoterDetails.)0->param");

}
public String getName() {
	return name;
}

@Required
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
@Required
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
	
	return "VoterDetails [name=" + name + ", age=" + age + ", add=" + add + "]";
}

}

