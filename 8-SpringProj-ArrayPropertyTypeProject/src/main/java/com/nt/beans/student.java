package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class student {
	private int[] marks;
	private Date[] date;
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public Date[] getDate() {
		return date;
	}
	public void setDate(Date[] date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "student [marks=" + Arrays.toString(marks) + ", date=" + Arrays.toString(date) + "]";
	}

}
