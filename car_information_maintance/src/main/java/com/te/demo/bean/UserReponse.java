package com.te.demo.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserReponse { 
	private boolean error;
	private String message;
	private List<CarDetails>carDetails;

}
