package com.rent.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rent.model.Car;

import com.rent.repository.CarRepository; 

@Service
@Transactional
public class CarService {
	
	@Autowired
	CarRepository carRepo;
	
	public List<Car> getAllCars() {
		List<Car> allcars = new ArrayList<Car>(); 
		carRepo.findAll().forEach(c1 -> allcars.add(c1));;
		return allcars;
	}
	
	public Car getCarById(Integer id) throws Exception {
		Optional<Car> car = carRepo.findById(id);
		Car card=car.orElseThrow(() -> new Exception("Car not found"));
		return card;
	}
	
	public Car addCar(Car carobj) {
		
		
		Car car=carRepo.save(carobj);
		
			return car;
}
	
	
}
