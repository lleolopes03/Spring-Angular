package com.br.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.br.demo.model.Course;

public interface CourseRepository  extends JpaRepository<Course,Long>{
    
}
