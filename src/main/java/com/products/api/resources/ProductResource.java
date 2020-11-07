package com.products.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/products/{id}")
	public Product findProductById(@PathVariable(value = "id") long id){
		return productRepo.findById(id);
	}
	
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return productRepo.save(product);	
	}
	
	@PutMapping("/product")
	public Product editProduct(@RequestBody Product product) {
		return productRepo.save(product);	
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProductById(@PathVariable(value ="id") long id) {
		productRepo.deleteById(id);	
	}
	
	
	

}
