package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.WebContainer;

@SpringBootApplication
public class SpringBootProj46LookupMethodInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer wc=null;
		
		ctx=SpringApplication.run(SpringBootProj46LookupMethodInjectionApplication.class, args);
	    wc=ctx.getBean("wc",WebContainer.class);
	    
	    wc.ProcessRequest("Deepak");
	    System.out.println("===================================");
	    wc.ProcessRequest("yadav");
	    ((ConfigurableApplicationContext) ctx).close();
	}

}
