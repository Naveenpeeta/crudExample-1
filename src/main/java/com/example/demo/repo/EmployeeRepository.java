package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.binding.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository< EmployeeDetails, Integer> {

	EmployeeDetails findByName(String id);

}
