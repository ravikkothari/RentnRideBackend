package com.rent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Float milegae;
	private String fuel;
	private Float engineDisplacement;
	private String maxPower;
	private Integer capacity;
	private String transmissionType;
	private Float bootSpace;
	private Float fuelTankCapacity;
	private String bodyType;
	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getMilegae() {
		return milegae;
	}
	public void setMilegae(Float milegae) {
		this.milegae = milegae;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public Float getEngineDisplacement() {
		return engineDisplacement;
	}
	public void setEngineDisplacement(Float engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	public String getMaxPower() {
		return maxPower;
	}
	public void setMaxPower(String maxPower) {
		this.maxPower = maxPower;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	public Float getBootSpace() {
		return bootSpace;
	}
	public void setBootSpace(Float bootSpace) {
		this.bootSpace = bootSpace;
	}
	public Float getFuelTankCapacity() {
		return fuelTankCapacity;
	}
	public void setFuelTankCapacity(Float fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
	
	
	
	
}
