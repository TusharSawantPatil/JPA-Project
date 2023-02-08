package com.Student.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Student.sms.Entity.Student;
import com.Student.sms.repository.StudentRepository;
import com.Student.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

}
