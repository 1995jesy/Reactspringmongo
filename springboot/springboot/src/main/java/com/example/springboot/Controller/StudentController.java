package com.example.springboot.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentRepository;


@RestController
@RequestMapping("/api")

public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/getALLStudent")
	public List<Student> getALLStudent(){
		return studentRepository.findAll();
		
	}
	
	
	@GetMapping("/Student/{id}")
	  public Optional<Student> getALLStudentById(@PathVariable("id") String id) {
		return studentRepository.findById(id);
	    
	  }

	  @PostMapping("/Student")
	  public Student createStudent(@RequestBody Student student) {
		  return studentRepository.save(student);
	    
	  }
	   
	  @PutMapping("/Student/{id}")
	  public Student updateStudent(@PathVariable("id") String id, @RequestBody  Student student) {
		  
		return student;
	    
	  }

	  @DeleteMapping("/Student/{id}")
	  public String deleteStudent(@PathVariable("id") String id) {
		  studentRepository.deleteById(id);
		return id;
	    
	  }

	 
	
}
