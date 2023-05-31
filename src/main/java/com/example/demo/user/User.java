package com.example.demo.user;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id; 
	private String name; 
	private LocalDate dob;
	private Integer age;
	
	
	public User(String name, Long id, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.age = age;
	}
	
	public User(String name, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	} 
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", dob=" + dob + ", age=" + age + "]";
	}
	
	
	
}
