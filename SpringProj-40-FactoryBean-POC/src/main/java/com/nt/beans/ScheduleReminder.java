package com.nt.beans;

import java.util.Date;

public class ScheduleReminder {

    Date date=null;

	public void setDate(Date date) {
		this.date = date;
	}
	
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
