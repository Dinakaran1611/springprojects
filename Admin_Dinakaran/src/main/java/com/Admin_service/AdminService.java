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
	
	public void save(Admin cust) {
		repo.save(cust);
	}
	
	public List<Admin> showalldata(){
		return repo.findAll();
	}
	public void deleteadmin(Integer id) {
		repo.deleteById(id);
	}
	public void deleteall(Admin cust) {
		repo.delete(cust);
	}
	public Admin searchbyid(Integer id) {
		return repo.findById(id).orElse(null);
	}
	public void updateadmindata(Integer id ,Admin UpdateAdmin) {
		
		Admin ExistingAdmin = repo.findById(id).orElse(null);
		if (ExistingAdmin!= null) {
			ExistingAdmin.setCid(UpdateAdmin.getCid());
			ExistingAdmin.setCname(UpdateAdmin.getCname());
			ExistingAdmin.setAddress(UpdateAdmin.getAddress());
			repo.save(ExistingAdmin);
		}
	}
}
