package com.comparableDemo;

import java.util.Comparator;

public class StudentNameCompare implements Comparator<Student> {

	@Override
	public int compare(Student st1, Student st2) {
		// TODO Auto-generated method stub
		return st1.getName().compareTo(st2.getName()) ;
	}

}
