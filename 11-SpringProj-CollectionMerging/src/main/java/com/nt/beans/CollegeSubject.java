package com.nt.beans;


import java.util.List;

public class CollegeSubject {
    private List<String> subject=null;

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "CollegeSubject [subject=" + subject + "]";
	}
     
     
}
