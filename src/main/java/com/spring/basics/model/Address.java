package com.spring.basics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "addresss")
@AllArgsConstructor
@NoArgsConstructor
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String locality;
	private String district;
	private String state;
	
	@ManyToOne
	@JoinColumn(name="Students_rollNo")
	Student student;
}
