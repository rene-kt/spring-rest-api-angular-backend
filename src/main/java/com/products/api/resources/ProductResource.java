package com.products.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST PRODUCTS W/ SPRING BOOT")
@CrossOrigin(origins = "*")
public class ProductResource {
	
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/products")
	@ApiOperation(value = "return all products from database")
	public List<Product> listProducts(){
		return productRepo.findAll();
	}
	
	@GetMapping("/products/{id}")
	@ApiOperation(value = "return one product from database by id")
	public Product findProductById(@PathVariable(value = "id") long id){
		return productRepo.findById(id);
	}
	
	
	@PostMapping("/product")
	@ApiOperation(value = "insert one product into database")
	public Product saveProduct(@RequestBody Product product) {
		return productRepo.save(product);	
	}
	
	@PutMapping("/product")
	@ApiOperation(value = "update one product from database")
	public Product editProduct(@RequestBody Product product) {
		return productRepo.save(product);	
	}
	
	@DeleteMapping("/product/{id}")
	@ApiOperation(value = "delete one product from database by id")
	public void deleteProductById(@PathVariable(value ="id") long id) {
		productRepo.deleteById(id);	
	}
	
	
	

}
