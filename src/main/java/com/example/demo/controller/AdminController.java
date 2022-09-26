package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;

@RestController

public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@GetMapping("/test")
	public ResponseEntity<List<Admin>> getAllAdmin() {
		
		List<Admin> suppliers= adminService.getAllAdmin();
		
		return new ResponseEntity<>(suppliers, HttpStatus.OK); 
	}
	
	
	@PostMapping("/A1/add")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin A1){
		
		Admin newsupp = adminService.addAdmin(A1);
		
		return new ResponseEntity<>(newsupp, HttpStatus.CREATED);
		

	}
	
	

	
	
}
	
	

	 
	
	
	


	
	
	
