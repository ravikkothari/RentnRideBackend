package com.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rent.model.Username;

@Repository
@EnableJpaRepositories
public interface UsernameRepository extends JpaRepository<Username, Integer>{
	
	
	
	@Query("select u from Username as u where u.Email=:Email AND u.Password=:Password")
	public Username loginUser(@Param("Email") String Email, @Param("Password") String Password);
}

