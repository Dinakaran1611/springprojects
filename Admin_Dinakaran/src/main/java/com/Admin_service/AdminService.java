package com.Admin_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {
	
	@Autowired
	private AdminRepository repo;
	
	//to get all records
	public List<Admin> getAllAdmins(){
		return repo.findAll();
	}
	
	//to get particular record
	public Admin getById(Integer id) {
		return repo.findById(id).get();
	}
	
	//to save record
	public Admin createAdmin(Admin admin) {
		return repo.save(admin);
	}
	
	//to update the records
	public void updateAdmin(Admin admin) {
		repo.save(admin);
	}
	
	//to delete records
	public void deleteAdmin(Integer id) {
		repo.deleteById(id);
	}
}
