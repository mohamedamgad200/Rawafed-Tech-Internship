package com.rawafed.inheritance;

import java.time.LocalDate;
public class MonthlyCommEmp extends MonthlyEmp {
	
	private double sales;
	private double comm;
	
	public MonthlyCommEmp(int id, String name, String address, 
			LocalDate hireDate, double salary,double sales,double comm) {
		super(id,name,address,hireDate,salary);
		setSalary(salary);
		setSales(sales);
		setComm(comm);
	}
	public double income() {
		return getSalary()+getSales()*getComm();
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	@Override
	public String toString() {
		return "MonthlyCommEmp [" + super.toString()+ ", sales "+ getSales()+" , comm "+getComm()+
				", income "+ income()+"]";
	}	
}
