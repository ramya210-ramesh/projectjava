package com.te.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.te.demo.bean.CarDetails;
import com.te.demo.dao.AdminDao;
import com.te.demo.dao.CarDao;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private CarDao carDao;

	private AdminDao adminDao;

	@Override
	public List<CarDetails> findBycarName(String carName) {
		return (List<CarDetails>) carDao.findBycarName(carName);
	}
	
	

}
