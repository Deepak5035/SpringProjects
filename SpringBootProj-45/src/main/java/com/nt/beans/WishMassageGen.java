package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmsg")
public class WishMassageGen {

	@Autowired
	Calendar calendar=null;
	WishMassageGen(){
		System.out.println("WishMassageGen.WishMassageGen()===>0param");
	}
	
	public String WishMassage() {
        System.out.println("WishMassageGen.WishMassage()");
		int hour=0;
		
        hour =calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hour<12)
		    return "Good Morning";
		
		else if(hour<17)
			return "Good Evning";
		else
			return "Good Night";
	}
}
