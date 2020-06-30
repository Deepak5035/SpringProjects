package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TravelAgent {
	
	
	//field level autowiring
	/*@Qualifier("plan")
	@Autowired(required=false)*/
	private TourPlan plan = null;
    
	//construcor level autowiring
	/*@Autowired
	public TravelAgent(TourPlan plan) {
		System.out.println("TravelAgent.TravelAgent()");
		this.plan = plan;
	}*/
	
	//setter level autowiring
	/*@Autowired
	public void setPlan(TourPlan plan) {
		this.plan = plan;
	}*/
	

	//arbitary method level autowiring
    @Autowired
    public void tourPlan(TourPlan plan) {
    	this.plan=plan;
    }
	
	public String destinationPrice(int noPlace) {

		for (int i = 0; i < plan.place.length; i++) {
			System.out.println(plan.place[i]);
		}
		return "BillAmount=" + noPlace * 30000;
	}



}
