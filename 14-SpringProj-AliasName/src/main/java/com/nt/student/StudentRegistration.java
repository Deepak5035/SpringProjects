package com.nt.student;

public class StudentRegistration {
    String name;
    int rollno;
    String collageName;
    String branch;
    String address;
    String gender;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "StudentRegistration [name=" + name + ", rollno=" + rollno + ", collageName=" + collageName + ", branch="
				+ branch + ", address=" + address + ", gender=" + gender + "]";
	}
	
}
