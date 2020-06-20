package com.nt.bean;

import java.util.Date;

public class WishMessageGenerator {
       private Date date;
     //Constructor for Constructor Injection
    public  WishMessageGenerator(Date date) {
    	this.date=date;
    	}
  //B.logic
    @SuppressWarnings("deprecation")
	public String MessageGenerator(String name) {
    int hour=0;
    hour=date.getHours();
    
    if(hour<12)
    	return"GM::"+name;
    else if (hour<16)
    	return "GE::"+name;
    else if (hour<20)
    	return "GE::"+name;
    else 
    	return "GN::"+name;
    
    	
    }
}


