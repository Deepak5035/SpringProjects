package com.nt.mobile;

import org.springframework.stereotype.Component;

@Component("mpc")
public class MobilePhoneCharger {
	public String charger() {
		return "charging Start...........100% complete";
	}
}
