package com.spring.basics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.basics.model.Address;
import com.spring.basics.model.Student;
import com.spring.basics.repository.AddressRepository;
import com.spring.basics.repository.StudentRepository;

@RestController
@RequestMapping("/home")
public class One2ManyController 
{
	@Autowired
	AddressRepository addressRepo;
	
	@Autowired
	StudentRepository studentRepo;
	
	@PostMapping("/address-post")
	public Address addressInsert(@RequestBody Address address)
	{
		
		return addressRepo.save(address);
		
	}
	
	@PostMapping("/student-post")
	public Student studentInsert(@RequestBody Student student)
	{
		
		return studentRepo.save(student);
		
	}
	
	@GetMapping("/getAllAddressDetails/{rollNo}")
	public String get(@PathVariable int rollNo,Student student)
	{
		return "Getting details of whole address of a Single Student..,It is One to Many Mapping"+studentRepo.findAll();
	}

}
