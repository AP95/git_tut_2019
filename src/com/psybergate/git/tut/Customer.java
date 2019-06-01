package com.psybergate.git.tut;

import java.util.Date;

public class Customer {

	private long customerNum;

	private String name;

	private Date dateOfBirth;

	public String toString() {
		return "Name: " + name + ", customerNum: " + customerNum + ", dateOfBirth: " + dateOfBirth;
	}

}