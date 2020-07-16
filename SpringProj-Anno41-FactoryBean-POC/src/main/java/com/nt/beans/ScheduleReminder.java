package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("deprecation")
@Component("sr")
public class ScheduleReminder {
    
	@Autowired
    Date date=null;
	
	ScheduleReminder(){
		System.out.println("ScheduleReminder.ScheduleReminder()");
	}

	
	public String reminder() {
		System.out.println("ScheduleReminder.reminder()");
		Date  sysDate=null;
		sysDate=new Date();
		
if(date.getYear()==sysDate.getYear() && date.getMonth()==sysDate.getMonth()&& date.getDate()==sysDate.getDate()) {

	return "today meeting";
}
else
	return "no meeting";
		
	}
	
	
}
