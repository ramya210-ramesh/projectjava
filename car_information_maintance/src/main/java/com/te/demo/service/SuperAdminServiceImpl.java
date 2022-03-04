package com.te.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.demo.bean.CarDetails;
import com.te.demo.dao.AdminDao;
import com.te.demo.dao.CarDao;

@Service
public class SuperAdminServiceImpl implements SuperAdminService {
	@Autowired
	private CarDao carDao;
	
	private AdminDao adminDao;

	@Override
	public List<CarDetails> getAllCarDetails() {
		return (List<CarDetails>) carDao.findAll();
	}

	

}
