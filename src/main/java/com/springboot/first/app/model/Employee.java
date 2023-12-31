package com.springboot.first.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="firstName",nullable=false)
		private String firstName;
	@Column(name = "lastName",nullable=true)
		private String lastName;
	@Column(name="email")
	private String email;
	public Employee orElseThrow(Object object) {
		return null;
	}
	
}
