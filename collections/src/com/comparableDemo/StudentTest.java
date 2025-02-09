package com.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		
		Student st1 = new Student(1, "Saleh", 24);
		Student st2 = new Student(1, "Waleed", 30);
		Student st3 = new Student(2, "Saleh", 25);
		Student st4 = new Student(3, "Ali", 35);
		Student st5 = new Student(5, "SAR", 30);
		Student st6 = new Student(1, "Saleh", 24);
		
		students.add(st1);
		students.add(st2);    // st2.equals(st1)
		students.add(st3);    // st3.equals(st1) 
		students.add(st4);
		students.add(st5);
		students.add(st6);
		
		for (Student st : students) {
			System.out.println(st);
		}
		System.out.println("****************************");
		System.out.println("****************************");
		List<Student> stList = new ArrayList<>(students);
		System.out.println("Students by List before sorting");
		for (Student st : stList) {
			System.out.println(st);
		}
		System.out.println("****************************");
//		Collections.sort(stList);
		Collections.sort(stList,(obj1,obj2)->obj1.getId()-obj2.getId());
		System.out.println("Students by List after sorting by id (accending)");
		for (Student st : stList) {
			System.out.println(st);
		}
		System.out.println("****************************");
		Collections.sort(stList, Comparator.reverseOrder());
		System.out.println("Students by List after sorting by id (descending)");
		for (Student st : stList) {
			System.out.println(st);
		}
		
		System.out.println("****************************");
//		Collections.sort(stList, new StudentNameCompare());
		Collections.sort(stList, (obj1,obj2)->obj1.getName().compareTo(obj2.getName()));
		System.out.println("Students by List after sorting by name (accending)");
		for (Student st : stList) {
			System.out.println(st);
		}
		System.out.println("****************************");
		Collections.sort(stList, new StudentNameCompare().reversed());
		System.out.println("Students by List after sorting by name (descending)");
		for (Student st : stList) {
			System.out.println(st);
		}
		
		System.out.println("****************************");
//		Collections.sort(stList, new StudentAgeCompare());
		Collections.sort(stList, (obj1,obj2)->obj1.getAge()-obj2.getAge());
		System.out.println("Students by List after sorting by age (accending)");
		for (Student st : stList) {
			System.out.println(st);
		}
		System.out.println("****************************");
		Collections.sort(stList, new StudentAgeCompare().reversed());
		System.out.println("Students by List after sorting by age (descending)");
		for (Student st : stList) {
			System.out.println(st);
		}
	}
}
