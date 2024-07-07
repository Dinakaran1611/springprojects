package com.Shop_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShopownerService {
	
	@Autowired
	private ShopownerRepository repo;

	public List<Shopowner> showalldata(){
		return repo.findAll();
	}
	public Shopowner searchbyid(Integer id) {
		return repo.findById(id).get();
	}
	public void save(Shopowner cust) {
		repo.save(cust);
	}
	public void updateshopowner(Shopowner cust) {
		repo.save(cust);
	}
	public void deleteshopowner(Integer id) {
		repo.deleteById(id);
	}
}
