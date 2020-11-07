package com.products.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.api.models.Product;
import com.products.api.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/api")
public class ProductResource {
	
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/products")
	public List<Product> listProducts(){
		return productRepo.findAll();
	}

}
