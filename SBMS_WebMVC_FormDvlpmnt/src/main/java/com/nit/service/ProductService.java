package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nit.entity.ProductEntity;
import com.nit.repositories.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	public void saveData(ProductEntity product) {
	  productRepo.save(product);
		System.out.println("Record Saved into DB...");
	}
}
