package com.nt.beans;

public class SingletoneClass {

	private static SingletoneClass instence;
	private SingletoneClass() {}
	
	public static SingletoneClass getInstence() {
		
		if(instence==null) {
		instence=new SingletoneClass();
		return instence;
		}
		else 
			return instence;
	}
		
			
}
	
