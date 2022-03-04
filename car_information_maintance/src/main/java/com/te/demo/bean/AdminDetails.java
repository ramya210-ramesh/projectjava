package com.te.demo.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Data
//@Table(name = "AdminDetails",uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
public class AdminDetails implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;
	@Column(name = "Name")
	private String username;
	@Column(name="Password")
	private String password;
	@Column(name="Role")
	private String role;
	
	
	
	

}
