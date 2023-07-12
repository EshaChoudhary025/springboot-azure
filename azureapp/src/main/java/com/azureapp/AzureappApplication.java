package com.azureapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureappApplication {
	
	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping("/product")
	public Employee addEmployee(@RequestBody Employee employee){
		return repo.save(employee);
		
	}
	@GetMapping("/products")
	public List<Employee> getEmployees(){
		return repo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureappApplication.class, args);
	}

}
