package com.abc.model;

import java.util.Date;

public class Company {

	private String name;
	private Date yearOfEstablishment;
	private String location;

	public Company() {
	}

	public Company(String name, Date yearOfEstablishment, String location) {
		super();
		this.name = name;
		this.yearOfEstablishment = yearOfEstablishment;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getYearOfEstablishment() {
		return yearOfEstablishment;
	}

	public void setYearOfEstablishment(Date yearOfEstablishment) {
		this.yearOfEstablishment = yearOfEstablishment;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", yearOfEstablishment=" + yearOfEstablishment + ", location=" + location
				+ "]";
	}

}
