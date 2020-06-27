package com.nt.student;

import java.util.Date;

public class StudentRegistration {
    String name;
    String rollno;
    String collageName;
    String branch;
    String address;
    String gender;
    Date   dob;

	public StudentRegistration(String name, String rollno, String collageName, String branch, String address,
			String gender,Date dob) {
        System.out.println("StudentRegistration.6-param");
		this.name = name;
		this.rollno = rollno;
		this.collageName = collageName;
		this.branch = branch;
		this.address = address;
		this.gender = gender;
        this.dob=dob; 	
	}

	@Override
	public String toString() {
		return "StudentRegistration [name=" + name + ", rollno=" + rollno + ", collageName=" + collageName + ", branch="
				+ branch + ", address=" + address + ", gender=" + gender + ", dob=" + dob + "]";
	}


	
}
