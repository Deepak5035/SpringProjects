package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;


@Named("ta")
public class TravelAgent {
	
	@Named("plan2")
	@Inject
	private TourPlan plan = null;

	
	public String destinationPrice(int noPlace) {

		for (int i = 0; i < plan.place.length; i++) {
			System.out.println(plan.place[i]);
		}
		return "BillAmount=" + noPlace * 30000;
	}



}
