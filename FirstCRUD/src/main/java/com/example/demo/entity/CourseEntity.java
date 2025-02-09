package com.example.demo.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courses")
public class CourseEntity {
	@Id()
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="course_name",length = 50, nullable = false)
	private String courseName;
	
	@Column(name="price")
	private double price;


	public CourseEntity() {
		super();
	}

	public CourseEntity(int courseId, String courseName, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
	}
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CourseEntity [courseId=" + courseId + ", courseName=" + courseName + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseId, courseName, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseEntity other = (CourseEntity) obj;
		return courseId == other.courseId && Objects.equals(courseName, other.courseName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
