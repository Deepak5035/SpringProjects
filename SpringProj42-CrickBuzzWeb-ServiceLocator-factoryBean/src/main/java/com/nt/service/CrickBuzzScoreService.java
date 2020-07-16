package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.external.ExternalIccScoreCompImp;

public class CrickBuzzScoreService implements CrickBuzzService {
   
   @Autowired 
   ExternalIccScoreCompImp icc=null;

	public CrickBuzzScoreService(ExternalIccScoreCompImp icc) {
	this.icc = icc;
    }

	public String score(int mid) {
		String score=icc.currentScore(mid);	
		return score;
	}

}
