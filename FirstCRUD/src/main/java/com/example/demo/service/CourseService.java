package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CourseEntity;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepo;
	public List<CourseEntity> getAllCourses() {
		return courseRepo.findAll();
	}

	public CourseEntity getCourseById(int id) {
		Optional<CourseEntity> courseOpt=courseRepo.findById(id);
		if(courseOpt.isPresent())
		{
			return courseOpt.get();
		}else
		{
			return null;
		}
	}

	public CourseEntity createCourse(CourseEntity course) {
		return courseRepo.save(course);
	}
	public CourseEntity updateCourse(CourseEntity course) {
		return courseRepo.save(course);
	}
	public void deleteCourse(CourseEntity course) {
		courseRepo.delete(course);
	}
	
}
