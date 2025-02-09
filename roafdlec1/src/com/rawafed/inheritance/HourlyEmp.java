package com.rawafed.inheritance;

import java.time.LocalDate;

public class HourlyEmp extends Emp  {
	
	private double rate;
	private int hours;
	 public HourlyEmp(int id, String name, String address, 
				LocalDate hireDate,double rate,int hours) {
		 super(id,name,address,hireDate);
		 setHours(hours);
		 
	 }
	 public double income() {
		 return getRate()*getHours();
	 }
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "HourlyEmp [" +super.toString()+" , rate"+getRate()
	+" ,hours"+getHours()+
	", income"+income()+"]";
	}
}
