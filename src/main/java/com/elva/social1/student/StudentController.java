package com.elva.social1.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
		
	@RequestMapping(value="/students", method=RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(value="students/{id}")
	public Optional<Student> getStudent(@PathVariable String id){
		return studentService.getStudent(id);
	}
	
	@RequestMapping(value="/students/{id}", method=RequestMethod.PUT)
	public void updateStudent(@PathVariable String id, @RequestBody Student student) {
		studentService.updateStudent(id, student);
		
	}
	
	@RequestMapping(value="/students/{id}", method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
	
	

}
