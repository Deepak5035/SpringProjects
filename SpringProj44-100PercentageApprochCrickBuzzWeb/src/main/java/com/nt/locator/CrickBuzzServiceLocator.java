package com.nt.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.nt.external.ExternalIccScoreCompImp;

@Component("cbsl")
public class CrickBuzzServiceLocator implements FactoryBean<ExternalIccScoreCompImp> {

	
	public ExternalIccScoreCompImp getObject() throws Exception {
		ExternalIccScoreCompImp icc=null;
		icc=new ExternalIccScoreCompImp();
		return icc;
	}

	public Class<?> getObjectType() {
		
		return ExternalIccScoreCompImp.class;
	}
    
	public boolean isSingleton() {
	
	return true;
   }
}
