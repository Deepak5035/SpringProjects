package com.nt.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.nt.service")
@ComponentScan(basePackages ="com.nt.locator")
@ComponentScan(basePackages = "com.nt.external")
public class AppConfig {

	
	
	
}
