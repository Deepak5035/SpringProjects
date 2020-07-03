package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.context.annotation.Lazy;



@Lazy
@Named("ta")
public class TravelAgent {

	@Resource(name="plan2")
	private TourPlan plan = null;

	
	public TravelAgent() {
		
		System.out.println("TravelAgent-0 Param Constructor");
	}

@PostConstruct
public void MyInit() {
	System.out.println("TravelAgent.MyInit()");
}

@PreDestroy
public void MyDestroy() {
	System.out.println("TravelAgent.MyDestroy()");
}

	public String destinationPrice(int noPlace) {

		for (int i = 0; i < plan.place.length; i++) {
			System.out.println(plan.place[i]);
		}
		return "BillAmount=" + noPlace * 30000;
	}




}
