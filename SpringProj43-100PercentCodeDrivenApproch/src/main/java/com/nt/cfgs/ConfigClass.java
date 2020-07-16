package com.nt.cfgs;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.nt.beans")
public class ConfigClass {
	
	@Bean(name = "cal")
	public Calendar getCalandar() {
		
		Calendar calendar=Calendar.getInstance();
		
		return calendar;
	}
	

}
