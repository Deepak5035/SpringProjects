package com.nt.servlet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Component("vd")
@Controller
//configuration of propeties file upto spring 3.x version
/*@PropertySources(value = { @PropertySource(value="com/nt/commons/info.properties"),
                           @PropertySource(value="com/nt/commons/info1.properties"),
                           @PropertySource(value="com/nt/commons/info2.properties")
                    }
             )*/


//from spring 4.x version
/*@PropertySource(value = "com/nt/commons/info.properties")
@PropertySource(value = "com/nt/commons/info1.properties")
@PropertySource(value = "com/nt/commons/info2.properties")*/

//any version of spring Array type
@PropertySource(value= {"com/nt/commons/info.properties","com/nt/commons/info.properties","com/nt/commons/info.properties"})

public class VoterDetails{

@Value("${voter.name}")
String name;

@Value("${voter.age}")
int age;

@Value("${voter.add}")
String add;

	/*@Required*/
public void setName(String name) {
	this.name = name;
}

	/*@Required*/
public void setAge(int age) {
	this.age = age;
}

public void setAdd(String add) {
	this.add = add;
}

public String CheckVotingEligibility() {

	if(age<18) 
	return  "not eligible";
	
	else
	return "eligibal";
}

@Override
public String toString() {
	
	return "VoterDetails [name=" + name + ", age=" + age + ", add=" + add + "]";
  }

}

