package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.Student;
import com.example.demo.service.StudentService;
import com.example.demo.util.StudentRequest;


@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveStudent(@RequestBody StudentRequest req) {
		
		return service.saveStudent(req);
	}
	
	@RequestMapping(value = "/getStudent", method = RequestMethod.GET)
	public  List<Student> getStudent(){
		return service.getStudent();
	}

}
