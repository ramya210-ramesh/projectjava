package com.te.demo.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDetails implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	private String carCompany;
	private String carName;
	private String carFuelType;
	private String carPowerSteering;
	private String carBreakSystem;
	private Double carShowroomPrice;
	private Double carOnroadPrice;
	private Double carMileage;
	private int carSeatingCapacity;
	private int carEngineCapacity;
	private String carGearType;

	@ManyToOne()
	@JoinColumn(referencedColumnName = "id")
	private AdminDetails adminDetails;

}
