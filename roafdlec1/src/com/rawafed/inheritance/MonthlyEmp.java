package com.rawafed.inheritance;

import java.time.LocalDate;
public class MonthlyEmp extends Emp {
	
	private double salary;
	public MonthlyEmp() {}
	public MonthlyEmp(int id, String name, String address, 
			LocalDate hireDate, double salary) {
		super(id,name,address,hireDate);
		setSalary(salary);
	}
    public double income() {
    	return getSalary();
    }
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "MonthlyEmp [" +super.toString() +", salary= " + salary +
				" , income "+income()+ "]";
	}
}
