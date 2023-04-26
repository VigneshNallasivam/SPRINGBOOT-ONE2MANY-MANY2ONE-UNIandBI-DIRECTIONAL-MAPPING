package com.spring.basics.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address;

}
