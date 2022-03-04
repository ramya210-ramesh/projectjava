package com.te.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.demo.bean.CarDetails;
import com.te.demo.bean.SuperAdminReponse;
import com.te.demo.model.AdminResponse;
import com.te.demo.service.SuperAdminService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="/superAdmin")
public class SuperAdminController {
	@Autowired
	private SuperAdminService superAdminService;

	
	@GetMapping("/car/info")
	public ResponseEntity<?> getAllCarDetailsWithAdminDetails() {
		List<CarDetails> allCarDetails = superAdminService.getAllCarDetails();
		if(allCarDetails!=null) {
			return ResponseEntity.ok(new SuperAdminReponse(false,"success",allCarDetails));
		}else {
			return ResponseEntity.ok(new SuperAdminReponse(true,"Data not Available",null));
		}
		
	}
	

}
