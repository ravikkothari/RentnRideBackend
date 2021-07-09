package com.rent.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rent.model.Car;
import com.rent.service.CarService;

@RestController
public class CarContoller {

	private static final Logger logger=LoggerFactory.getLogger(Car.class);

	@Autowired
	CarService carService;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/allcars")
	public ResponseEntity<List<Car>> allcars(){
		List<Car> cars=carService.getAllCars();
		return new ResponseEntity<>(cars,HttpStatus.OK);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/car/{id}")
	public Car getCarById(@PathVariable Integer Id) throws Exception{
		Car car=carService.getCarById(Id);

		return car;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/addcar")
	public ResponseEntity<String> addCar(@RequestBody Car car) {
		carService.addCar(car);
		return new ResponseEntity<>("Car Added successfully", HttpStatus.CREATED);
	}

}
