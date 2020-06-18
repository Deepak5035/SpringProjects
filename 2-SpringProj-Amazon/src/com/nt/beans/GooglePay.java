package com.nt.beans;

public class GooglePay implements PaymentGateway {

	@Override
	public String Payment(Double Amount) {
		
		return Amount+"  Payment Done by GooglePay";
	}

}
