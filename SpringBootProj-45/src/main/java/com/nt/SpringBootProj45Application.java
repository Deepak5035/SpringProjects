package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.WishMassageGen;

@SpringBootApplication
public class SpringBootProj45Application {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WishMassageGen wmg = null;
		System.out.println("SpringBootProj45Application.main()");
		ctx = SpringApplication.run(SpringBootProj45Application.class, args);

			wmg=ctx.getBean("wmsg",WishMassageGen.class);
			 
			System.out.println(wmg.WishMassage());
			
			 ((ConfigurableApplicationContext) ctx).close();

	}

}
