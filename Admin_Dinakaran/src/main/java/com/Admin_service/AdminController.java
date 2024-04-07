package com.Admin_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {
	@Autowired
	private AdminService service;
	
	@PostMapping("/Adminservice")
	public void add(@RequestBody Admin cust)
	{
		service.save(cust);
	}
	
	
	@GetMapping("/Adminservice")
	public List<Admin> ShowAll()
	{
		return service.showalldata();
	}

	
	@GetMapping("/Adminservice/{id}")
	public Admin getCustomerById(@PathVariable Integer id)
	{
		return service.searchbyid(id);
	}
	
	@DeleteMapping("/Adminservice/{id}")
	public void deleteCustomer(@PathVariable Integer id)
	{
		service.deleteadmin(id);
	}
	
	@PutMapping("/Adminservice/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer id,@RequestBody Admin updatedCustomer)
	{
		service.updateadmindata(id,updatedCustomer);
		return ResponseEntity.ok("Admin updated Successfully");
	}
}
