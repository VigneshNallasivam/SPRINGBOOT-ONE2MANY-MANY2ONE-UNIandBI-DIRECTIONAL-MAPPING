package com.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spring.basics.model.Address;
import com.spring.basics.repository.AddressRepository;
import com.spring.basics.repository.StudentRepository;
import com.spring.basics.model.*;

@SpringBootApplication
public class OneToManyApplication 
{
	@Autowired
	AddressRepository obj;
	
	@Autowired
	StudentRepository objx;

	public static void main(String[] args)
	{
		SpringApplication.run(OneToManyApplication.class, args);
	}
	
//	public void run(String... args) throws Exception
//    {
//        Student student = new Student(1,"Vignesh",obj.findAll());
//        objx.save(student);
//        Address address = new Address(1,"Pvs", "Erode","Tamil-Nadu",student);
//        obj.save(address);
//    }

}
