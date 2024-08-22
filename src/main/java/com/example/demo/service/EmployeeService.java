package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.EmployeeDetails;
import com.example.demo.model.EmployeeDetailsModel;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepository EmployeeJpaRepository;
  
  
  public  void saveEmployee(List<EmployeeDetailsModel> employees) { 
	  List<EmployeeDetails> employeeDetails = new ArrayList<>();
	  employees.stream().forEach(employee->{
		  EmployeeDetails employeeDetail = new EmployeeDetails();
		  employeeDetail.setName(employee.getName());
		  employeeDetail.setSalary(employee.getSalary());
		  employeeDetails.add(employeeDetail);
	  });
	   EmployeeJpaRepository.saveAll(employeeDetails);
  }
  public EmployeeDetails getEmployeeById(int id) {
	  return EmployeeJpaRepository.findById(id).orElse(null);
  }
  public EmployeeDetails getEmployeeByName(String id) {
	  return EmployeeJpaRepository.findByName(id);
  }
  
}
