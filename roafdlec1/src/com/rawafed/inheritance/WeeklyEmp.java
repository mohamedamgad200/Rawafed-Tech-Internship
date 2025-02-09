package com.rawafed.inheritance;

import java.time.LocalDate;
public class WeeklyEmp extends Emp  {
	
	private double wage;
	
	public WeeklyEmp(int id, String name, String address, LocalDate hireDate,double wage) {
	    setId(id);
	    setName(name);
	    setAddress(address);
	    setHireDate(hireDate);
		setWage(wage);
	}
	public double income(){
		return getWage()*4;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	@Override
	public String toString() {
		return "WeeklyEmp [id=" + getId() + ", name=" + getName()+ 
				", address=" + getAddress() + ", hireDate=" + getHireDate() +
				", wage"+ getWage()+", income=" + income()+ "]";
	}	
}
