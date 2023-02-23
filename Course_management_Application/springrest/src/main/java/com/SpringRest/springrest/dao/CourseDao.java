package com.SpringRest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringRest.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
