package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.external.ExternalIccScoreCompImp;
import com.nt.locator.CrickBuzzServiceLocator;

@Component("cbss")
public class CrickBuzzScoreService implements CrickBuzzService {
   
   @Autowired 
   CrickBuzzServiceLocator seriveLocator=null;

	public CrickBuzzScoreService(CrickBuzzServiceLocator seriveLocator) {
	this.seriveLocator = seriveLocator;
    }

	public String score(int mid) {
		String currentScore=null;
		
		try {
			ExternalIccScoreCompImp score;
			score = seriveLocator.getObject();
			currentScore=score.currentScore(mid);
			return currentScore;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentScore;

	}

}
