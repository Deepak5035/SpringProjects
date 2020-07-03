package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;


@Named("ta")
public class TravelAgent {
	
	
	//field level injection
	/*@Qualifier("plan1")*/
	/*@Named("plan2")*/
	@Resource(name="plan2")// also take name attribute to avoid ambiguti prblm
	private TourPlan plan = null;

	//setter level injection
	/*@Resource
	public void setPlan(TourPlan plan) {
		this.plan = plan;
	}*/
	
	//constructor level injection
	/*	@Resource                      //this anno not allow for constructor level injections
 		public TravelAgent(TourPlan plan) {
			super();
			this.plan = plan;
		}
	*/
	

	
	
	public String destinationPrice(int noPlace) {

		for (int i = 0; i < plan.place.length; i++) {
			System.out.println(plan.place[i]);
		}
		return "BillAmount=" + noPlace * 30000;
	}




}
