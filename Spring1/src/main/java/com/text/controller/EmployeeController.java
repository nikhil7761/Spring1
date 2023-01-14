package com.text.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.met.model.Employee;
import com.met.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	public  ModelAndView initiallizeEmployee() {
		
		ModelAndView modelAndView=new ModelAndView();
		
		
		Employee defEmp=new Employee();
		
		modelAndView.addObject("emp", defEmp);
		
	
		modelAndView.setViewName("emp");
		
		return modelAndView;
		
	}
	
	
	
	
	
	

}
