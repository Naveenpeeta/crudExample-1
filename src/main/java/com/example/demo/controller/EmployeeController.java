package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.EmployeeDetails;
import com.example.demo.model.EmployeeDetailsModel;
import com.example.demo.service.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/employeeApi")
public class EmployeeController {
	
	@Autowired
	private EmployeeService controllerService;
	
	//PostMapping("/addEmployees")
	@PostMapping(path = "/addEmployees", produces = MediaType.APPLICATION_JSON_VALUE)
	public void  addEmployee(@RequestBody List<EmployeeDetailsModel> employees) {
		//TODO: process POST request
		
		 controllerService.saveEmployee(employees);
	}
	
	
	@GetMapping("/addEmployees/{id}")
	public EmployeeDetails getEmployeeById(@RequestParam Integer id) {
		return controllerService.getEmployeeById(id);
	}
	
	@GetMapping("/addEmployees/{name}")
	public EmployeeDetails getEmployeeByName(@RequestParam String id) {
		return controllerService.getEmployeeByName(id);
	}
	
	
     
}
