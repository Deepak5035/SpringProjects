package com.nt.beans;

import java.util.Random;

public class Amazon {
   private PaymentGateway paymentGateway;
   private Courier courier;
   int orderId;
   Random random=null;
   double basePrice;
   double gst;
   double totalAmount;
   int itemCount=0;
   String paymentStates;
   String courierStates;
 public void setPaymentGateway(PaymentGateway paymentGateway) {
	this.paymentGateway = paymentGateway;
}
 
   public void setCourier(Courier courier) {
	this.courier = courier;
}
   public boolean loginDetails(String usename,String password){
	   String dataBaseUserName="deepak";
	   String dataBasePassword="nit@123";
	   if(dataBaseUserName.equalsIgnoreCase(usename)&& dataBasePassword.equals(password)) 
		   return true;
        else 
        	return false;
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
	   paymentStates=paymentGateway.Payment(totalAmount);
	   courierStates=courier.deliver(orderId);
	   return"Total no of items  "+itemCount+" Bill Amount(with GST) "+paymentStates+" for Order id "+courierStates;
   }
   
}
