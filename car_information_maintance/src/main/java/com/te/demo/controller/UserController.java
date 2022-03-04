package com.te.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.te.demo.bean.CarDetails;
import com.te.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/car/{carName}")
	public ResponseEntity<?> getCarInfo(@PathVariable String CarName) {
		CarDetails details;
		try {
			details = (CarDetails) userService.findBycarName(CarName);
			return new ResponseEntity<CarDetails>(details,HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>("Something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);

		}
		
	}
}
