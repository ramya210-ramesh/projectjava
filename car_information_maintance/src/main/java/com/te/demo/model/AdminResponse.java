package com.te.demo.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// @JsonIncludeProperties
public class AdminResponse {
	private boolean error;
	private String message;
//	private String role;
	private String token;
	private Collection<? extends GrantedAuthority> adminRoles;

}
