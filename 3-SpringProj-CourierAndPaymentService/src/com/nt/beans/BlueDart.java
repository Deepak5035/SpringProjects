package com.nt.beans;

public class BlueDart implements Courier{
	@Override
	public String deliver(int orderid) {
		return orderid+"(Deliver by DTDC)";
	}
}
