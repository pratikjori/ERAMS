 package com.example.Project.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.entity.EmployeeEntity;
import com.example.Project.service.EmployeeServiceimpl;



@RestController
public class EmployeeController 
{

	@Autowired
    private EmployeeServiceimpl employeeService;
	
	 @PostMapping("/register")
	 public EmployeeEntity register (@RequestBody EmployeeEntity employeeentity)
	 {
		return employeeService.register(employeeentity);	 
	 }
	
	  @GetMapping("/list") 
	  public List<EmployeeEntity> AllUser()
	  {
		  return employeeService.FetchAllUser();  
	  }
	 
	  @DeleteMapping("/list/{Emp_id}")
	  public String deleteEmp(@PathVariable("Emp_id") int Emp_id)
	  {
		  employeeService.deleteEmpById(Emp_id);
	    return "deleted succefully";
	  }
	 
	 @GetMapping("/list/{Emp_id}")
	 public EmployeeEntity getEmpById(@PathVariable("Emp_id")int Emp_id)
	 {
		 return employeeService.getEmpById(Emp_id);
		  
		
	 }
	 
	 @PutMapping("/list/{Emp_id}")
	 public EmployeeEntity updateEmpById(@RequestBody EmployeeEntity employeeentity,
			                             @PathVariable int Emp_id)
	 {
		  employeeService.updateEmpById(employeeentity,Emp_id);
		  return employeeentity;
	 }
	  
}
	
	
