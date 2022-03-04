package com.te.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.te.demo.bean.AdminDetails;
import com.te.demo.bean.CarDetails;
import com.te.demo.bean.MyAdmin;
import com.te.demo.dao.AdminDao;
import com.te.demo.dao.CarDao;

@Service
public class CarService implements UserDetailsService {
	@Autowired
	private AdminDao adminDao;

	@Autowired
	private CarDao carDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AdminDetails AdminName = adminDao.findByUsername(username);
		if (AdminName != null) {

			return new MyAdmin(AdminName);
		}
		throw new UsernameNotFoundException("Admin is Not Found! ");
	}

	public AdminDetails createRegistration(AdminDetails admin) {
		return adminDao.save(admin);
	}

	public List<CarDetails> CarDetails() {
		return (List<CarDetails>) carDao.findAll();
	}

	public CarDetails addCar(CarDetails car) {

		return carDao.save(car);

	}

	public void deleteCar(int carId) {
		carDao.deleteById(carId);
	}


}
