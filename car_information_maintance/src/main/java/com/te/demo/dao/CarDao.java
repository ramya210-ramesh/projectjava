package com.te.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.te.demo.bean.CarDetails;

public interface CarDao extends CrudRepository<CarDetails,Integer>{
	public CarDetails findByCarId(int carId);

	public CarDetails findBycarName(String carName);
}

