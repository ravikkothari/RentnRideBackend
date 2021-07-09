package com.rent.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rent.model.Admin;
import com.rent.model.Username;

@Repository
@EnableJpaRepositories
public interface AdminRepository extends CrudRepository<Admin,Long> {

	
}
