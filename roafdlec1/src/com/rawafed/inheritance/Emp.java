package com.rawafed.inheritance;

import java.time.LocalDate;

public class Emp {
	private int id;
	private String name;
	private String address;
	private LocalDate hireDate;
	
	public Emp() {}
	
	public Emp(int id, String name, String address, LocalDate hireDate) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.hireDate = hireDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", hireDate=" + hireDate + "]";
	}

}
