package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmsg")
public class WishService {
	@Autowired
	Calendar calendar=null;

	public String WishGanrator(String name) {
		int hour=0;
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hour<12)
			return "Good Morning"+name;
		else if(hour<17)
			return "Good After Noon"+name;
		else
			return "Good night"+name;
		
	}
}
