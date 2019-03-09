package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bo.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.util.StudentRequest;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;
	
	public String  saveStudent(StudentRequest req) {
		Student student = new Student();
		student.setMark(req.getMark());
		student.setName(req.getName());
		student.setPhone(req.getPhone());
		student.setAddress(req.getAddress());
		
		repository.save(student);
		return "Sucess";
	}
	
	public List<Student>  getStudent() {
		return repository.findAll();
	}
}
