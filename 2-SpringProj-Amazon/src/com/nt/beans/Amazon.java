package com.nt.beans;

import java.util.Random;

public class Amazon {
   private PaymentGateway paymentGateway;
   int orderId;
   Random random=null;
   double basePrice;
   double gst;
   double totalAmount;
   int itemCount;
   String states;
 public void setPaymentGateway(PaymentGateway paymentGateway) {
	this.paymentGateway = paymentGateway;
}
   public String purchase(String item[],double[] amount) {
	   random=new Random();
	   orderId=random.nextInt(5000);
	   for(int i=0;i<item.length;i++) {
		   basePrice=basePrice+amount[i];
		   gst=gst+(amount[i]/100)*18;
		   itemCount++;
		 }
	   totalAmount=basePrice+gst;
	   states=paymentGateway.Payment(totalAmount);
	   return"Total no of items  "+itemCount+"  Bill Amount(with GST) "+states+" for Order id "+orderId;
   }
   
}
