package com.Student.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.sms.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
}
