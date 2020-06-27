package com.nt.beans;

public class CricektVO {
 
	String pName=null;
	String tShirtNo=null;
	String pTeam=null;
	String pPostiton=null;
	String pAdd=null;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String gettShirtNo() {
		return tShirtNo;
	}
	public void settShirtNo(String tShirtNo) {
		this.tShirtNo = tShirtNo;
	}
	public String getpTeam() {
		return pTeam;
	}
	public void setpTeam(String pTeam) {
		this.pTeam = pTeam;
	}
	public String getpPostiton() {
		return pPostiton;
	}
	public void setpPostiton(String pPostiton) {
		this.pPostiton = pPostiton;
	}
	public String getpAdd() {
		return pAdd;
	}
	public void setpAdd(String pAdd) {
		this.pAdd = pAdd;
	}
	@Override
	public String toString() {
		return "CricektVO [pName=" + pName + ", tShirtNo=" + tShirtNo + ", pTeam=" + pTeam + ", pPostiton=" + pPostiton
				+ ", pAdd=" + pAdd + "]";
	}
	
	
	
}
