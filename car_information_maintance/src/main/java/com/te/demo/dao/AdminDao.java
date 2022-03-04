package com.te.demo.dao;

import org.springframework.stereotype.Repository;

import com.te.demo.bean.AdminDetails;


import org.springframework.data.repository.CrudRepository;



@Repository
public interface AdminDao extends CrudRepository<AdminDetails,Integer> {
	public AdminDetails findById(int Id);

	public AdminDetails findByUsername(String username);

	

}
