package com.heidichen.serverdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.serverdemo.models.Student;
import com.heidichen.serverdemo.repositories.StudentRepository;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class StudentAPI {

	@Autowired
	private StudentRepository studentRepo;
	
	@GetMapping("/students")
	public ResponseEntity<Object> allStudents(){
		return ResponseEntity.ok().body(studentRepo.findAll());
	} 
	
    @PostMapping("/students")
    public ResponseEntity<Object> createClient(@Valid @RequestBody Student student, BindingResult result) {
    	if(result.hasErrors()) {
    		System.out.println(result.getAllErrors());
    		return ResponseEntity.status(400).body(result.getAllErrors());
    	}
        Student savedStudent = studentRepo.save(student);
        return ResponseEntity.ok().body(savedStudent);
    }
    
	
    @DeleteMapping("/students/{id}")
    public ResponseEntity<Object> deleteClient(@PathVariable("id") Long id) {
        studentRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
    
	@GetMapping("/students/{id}")
	public Student oneStudent(@PathVariable Long id){
		return studentRepo.findById(id).orElseThrow(RuntimeException::new);
	}
    
    @PutMapping("/students/{id}")
    public ResponseEntity<Object> updateClient(@PathVariable("id") Long id, @Valid @RequestBody Student student, BindingResult result) {
    	if(result.hasErrors()) {
    		return ResponseEntity.status(400).body(result.getAllErrors());
    	}
        Student savedStudent = studentRepo.save(student);
        return ResponseEntity.ok().body(savedStudent);
    }
}
