package com.nt.beans;

public class DTDC implements Courier {
	@Override
	public String deliver(int orderid) {
		return orderid+"(Deliver by DTDC)";
	}

}
