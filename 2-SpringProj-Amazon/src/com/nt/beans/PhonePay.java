package com.nt.beans;

public class PhonePay implements PaymentGateway {

	@Override
	public String Payment(Double Amount) {
		
		return Amount+"  Payment Done by PhonePay";
	}

}
