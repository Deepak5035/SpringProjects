package com.nt.servlet;

public class VoterDetails {

String name;
int age;
String add;


public VoterDetails() {

	System.out.println("VoterDetails.)--0->param");

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

//custom init Method

public void MyInit() {
	
	System.out.println("VoterDetails.MyInit()");
	
	if(age<0)
	age=age*-1;
	
	if(age<2 || age>120) {
		throw new IllegalArgumentException("invalid age");
	}	
}

public void MyDestroy() {
	
	System.out.println("VoterDetails.MyDistroy()");
	//nullify the bean
	name=null;
	add=null;
	age=0;
	VoterDetails vt=null;
	
}

@Override
public String toString() {
	System.out.println("VoterDetails.toString()");
	return "VoterDetails [name=" + name + ", age=" + age + ", add=" + add + "]";
}


		
}
