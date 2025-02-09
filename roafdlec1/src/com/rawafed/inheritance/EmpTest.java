package com.rawafed.inheritance;

import java.time.LocalDate;

public class EmpTest {

	public static void main(String[] args) {
		// Monthly Salary
		// Monthly Salary + commission
		// Weekly Salary
		// Hourly Salary
		
		MonthlyEmp me = new MonthlyEmp(55, "Muahmmad", "Riyadh", LocalDate.of(2010, 12, 23), 10000);
		MonthlyCommEmp mce = new MonthlyCommEmp(33, "Ahmed", "Cairo", LocalDate.of(2019, 5, 12), 5000, 100000, .02);
		HourlyEmp he = new HourlyEmp(22, "Salah", "Jeddah", LocalDate.of(2022, 7, 5), 50, 160);
		WeeklyEmp we = new WeeklyEmp(89, "Islam", "Cairo", LocalDate.of(2023, 10, 9), 3000);
		
		System.out.println(me);
		System.out.println("****************");
		System.out.println(mce);
		System.out.println("****************");
		System.out.println(he);
		System.out.println("****************");
		System.out.println(we);
		System.out.println("****************");
		Emp e0=new MonthlyEmp(55, "Muahmmad", "Riyadh", LocalDate.of(2010, 12, 23), 10000);
		Emp e1=new MonthlyCommEmp(33, "Ahmed", "Cairo", LocalDate.of(2019, 5, 12), 5000, 100000, .02);
		Emp e2=new HourlyEmp(22, "Salah", "Jeddah", LocalDate.of(2022, 7, 5), 50, 160);
		Emp e3=new WeeklyEmp(89, "Islam", "Cairo", LocalDate.of(2023, 10, 9), 3000);
		
		Emp[]emps=new Emp[4];
		emps[0] = me;
		emps[1] = mce;
		emps[2] = he;
		emps[3] = we;
		System.out.println("****** employees using array ");
		for (int i = 0; i < emps.length; i++) {
			Emp e = emps[i];
			System.out.println("e"+i+": " + e.toString());
		}
		
		
		
		
		
		
		
		
	}

}
