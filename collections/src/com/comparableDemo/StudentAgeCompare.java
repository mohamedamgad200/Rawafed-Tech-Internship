package com.comparableDemo;

import java.util.Comparator;

public class StudentAgeCompare implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		// TODO Auto-generated method stub
		return st1.getAge() - st2.getAge();
	}

}
