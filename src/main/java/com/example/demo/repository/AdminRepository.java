package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{
	
	Optional<Admin> findByUserNameIgnoreCase(String userName);
	

}
