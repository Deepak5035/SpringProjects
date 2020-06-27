package com.nt.beans;

public class TravelAgent {
	private TourPlan plan = null;

		 public void setPlan(TourPlan plan) {
			this.plan = plan;
		
		 }

		public TravelAgent(TourPlan plan) {
			this.plan = plan;
		   System.out.println("TravelAgent-param");
		}

	/*	public TravelAgent() {
	  System.out.println("TravelAgent-0-param");
		}
	*/
	public String destinationPrice(int noPlace) {

		for (int i = 0; i < plan.place.length; i++) {
			System.out.println(plan.place[i]);
		}
		return "BillAmount=" + noPlace * 30000;
	}

}
