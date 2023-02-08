package com.Student.sms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Student.sms.service.StudentService;
		
@Controller  
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle list Student andreturn model view
	@GetMapping("/students")
	public String listStudents(Model model) {
		
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
		
	}
	
}
