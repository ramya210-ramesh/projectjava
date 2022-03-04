package com.te.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationRequest {
	private String username;
	private String password;
//	private String role;

	public AuthenticationRequest() {

	}

	

}
