package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Admin;
import com.example.demo.exception.AdminNotFoundException;

public interface AdminService {
	Admin addAdmin(Admin A1);
	Admin updateAdmin(int adminId,Admin A1) throws AdminNotFoundException;
	void deleteAdmin(int adminId) throws AdminNotFoundException;
	List<Admin> getAllAdmin();
	
	
	
}
