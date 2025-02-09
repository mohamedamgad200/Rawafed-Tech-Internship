package com.comparableDemo;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public Student(int id,String name,int age)
	{
		super();
		this.age=age;
		this.name=name;
		this.id=id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		return this.id - st.id;
	}
}
