package com.sarayamvc.model;

import java.util.Date;

public class Patient {
	private int id;
	private String user;
	private String firstName;
	private String lastName;
	private String address;
	private String number;
	private String vaccineType;
	private Date date;
	private int numberDose;
	
	public Patient() {
		super();
	}

	public Patient(int id, String user, String firstName, String lastName, String address, String number,
			String vaccineType, Date date, int numberDose) {
		super();
		this.id = id;
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.number = number;
		this.vaccineType = vaccineType;
		this.date = date;
		this.numberDose = numberDose;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNumberDose() {
		return numberDose;
	}

	public void setNumberDose(int numberDose) {
		this.numberDose = numberDose;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", user=" + user + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", number=" + number + ", vaccineType=" + vaccineType + ", date=" + date
				+ ", numberDose=" + numberDose + "]";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	
}
