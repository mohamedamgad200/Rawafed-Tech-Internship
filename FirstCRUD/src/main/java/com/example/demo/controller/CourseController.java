package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CourseEntity;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@GetMapping("/all")
	public List<CourseEntity> getAllCourses() {
		return courseService.getAllCourses();
	}

	@GetMapping("")
	public CourseEntity getById(@RequestParam int id) {
		return courseService.getCourseById(id);
	}

	@PostMapping("")
	public CourseEntity createCourse(@RequestBody CourseEntity course) {
		return courseService.createCourse(course);
	}

	@DeleteMapping("/delete/{id}")
	public boolean deleteCourse(@PathVariable int id) {
		CourseEntity course = courseService.getCourseById(id);
		if (course == null) {
			return false;
		} else {
			courseService.deleteCourse(course);
			return true;
		}
	}
	@PutMapping()
	public CourseEntity updateCourse(@RequestBody CourseEntity course) {
		return courseService.createCourse(course);
	}
}
