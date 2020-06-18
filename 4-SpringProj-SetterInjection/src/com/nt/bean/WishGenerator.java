package com.nt.bean;


import java.util.Date;

public class WishGenerator {

	 //bean properties
	 private Date date;

	public void setDate(Date date) {
		this.date = date;
	}
	//B.logic
	@SuppressWarnings("deprecation")
	public String generatorWishMsg(String user) {
		int hour=0;
		
		//get Current Hour of day
		hour=date.getHours();
		
		if(hour<12)
			return "GM::"+user;
		 else if(hour<16)
			return "GA::"+user;
		 else if(hour<20)
			return "GE::"+user;
		else
			return "GN::"+user;
		}
}
