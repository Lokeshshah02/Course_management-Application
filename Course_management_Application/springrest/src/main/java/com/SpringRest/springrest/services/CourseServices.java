package com.SpringRest.springrest.services;

import java.util.List;
import com.SpringRest.springrest.entities.Course;

public interface CourseServices {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);

	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long parseLong);



}
