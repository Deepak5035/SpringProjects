package com.nt.beans;

public class Paytm implements PaymentGateway {

	@Override
	public String Payment(Double Amount) {
		
		return Amount+"  Payment Done by Paytm";
	}

}
