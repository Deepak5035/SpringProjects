package com.nt.cfgs;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
/*@ComponentScan(basePackages="com.nt.beans")
@ImportResource
*/
public class AppConfig {
	
	AppConfig(){
		System.out.println("AppConfig.AppConfig()==>0-param");
	}

@Bean("cal")
public Calendar getCalendar() {
	System.out.println("AppConfig.getCalendar()");
	return Calendar.getInstance();

 }

}
