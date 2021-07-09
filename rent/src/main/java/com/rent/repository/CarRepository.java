package com.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rent.model.Car;


@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {
	
	

}
