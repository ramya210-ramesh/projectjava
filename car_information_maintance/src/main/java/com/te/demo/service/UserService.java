package com.te.demo.service;


import java.util.List;

import com.te.demo.bean.CarDetails;

public interface UserService {
	List<CarDetails> findBycarName(String carName);


//	CarDetails findByCarName(String carName);

}
