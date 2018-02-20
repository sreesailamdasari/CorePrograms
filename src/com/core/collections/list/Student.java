package com.core.collections.list;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7183335177342017956L;

	private int rollNo;
	private String section;

	public Student() {
		super();
	}

	public Student(int rollNo, String section) {
		this.rollNo = rollNo;
		this.section = section;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", section=" + section + "]";
	}

}
