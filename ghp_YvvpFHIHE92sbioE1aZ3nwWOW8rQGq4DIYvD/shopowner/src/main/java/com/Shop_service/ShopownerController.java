package com.Shop_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import jakarta.persistence.NoResultException;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ShopownerController {
	@Autowired
	private ShopownerService service;
	
	@GetMapping("/Shopownerservice")
	public List<Shopowner> ShowAll()
	{
		return service.showalldata();
	}

	
	@GetMapping("/Shopownerservice/{id}")
	public ResponseEntity<Shopowner> getById(@PathVariable Integer id) {
	{try {
		Shopowner cust = service.searchbyid(id);
		return new ResponseEntity<Shopowner>(cust,HttpStatus.OK);
	}catch(NoResultException e) {
		return new ResponseEntity<Shopowner>(HttpStatus.NOT_FOUND);
		}
	}}
	
	@PostMapping("/Shopownerservice")
	public void add(@RequestBody Shopowner cust)
	{
		service.save(cust);
	}
	
	
	
	@PutMapping("/Shopownerservice/{id}")
	public ResponseEntity<Shopowner> updateAdmin(@PathVariable Integer id, @RequestBody Shopowner update_a) {
		try {
			Shopowner cust = service.searchbyid(id);

			cust.setCname(update_a.getCname());
			cust.setAddress(update_a.getAddress());
			cust.setPass(update_a.getPass());
			cust.setEmail(update_a.getEmail());
			service.updateshopowner(cust);
			return new ResponseEntity<>(cust, HttpStatus.OK);
		} catch (NoResultException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/Shopownerservice/{id}")
	public void deleteCustomer(@PathVariable Integer id)
	{
		service.deleteshopowner(id);
	}
}
	
