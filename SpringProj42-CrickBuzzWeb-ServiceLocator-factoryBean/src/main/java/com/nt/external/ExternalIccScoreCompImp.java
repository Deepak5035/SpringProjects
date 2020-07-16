package com.nt.external;

public class ExternalIccScoreCompImp implements ExtrenalIccScoreComp {

	public String currentScore(int mid) {
		
		if(mid==123) {
			return "IND 324/4";
		}
		else if(mid==456) {
			return "SAL 232/2";
		}
		else if(mid==789) {
			return "AUS 354/9";
		}
		else return"invalid Match Id";
	}

}
