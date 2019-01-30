package com.example.demo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends CrudRepository<Citizen, Serializable>{
	
	/* public Employee findByid(int id);*/

}
