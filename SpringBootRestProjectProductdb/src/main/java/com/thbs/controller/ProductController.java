package com.thbs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.thbs.model.Product;
import com.thbs.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository pr;
	@PostMapping("/product")
	public ResponseEntity<Product> save(@RequestBody Product product)
	{
		Product p=pr.save(product);
		return new ResponseEntity<Product>(p,HttpStatus.OK);
	}
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>>getAllProducts()
	{
		List<Product> plist=pr.findAll();
		return new ResponseEntity<List<Product>>(plist,HttpStatus.OK);
	}
	@GetMapping("/getAProduct/{id}")
	public ResponseEntity<Product> getAProduct(@PathVariable int id)
	{
		Optional<Product> pk=pr.findById(id);
		if(pk.isPresent())
		{
			Product p=pk.get();
			return new ResponseEntity<Product>(p,HttpStatus.OK);
			
		}
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/deleteAProduct/{id}")
	public ResponseEntity<Product> deleteProductById(@PathVariable int id)
	{
		if(pr.existsById(id))
		{
			pr.deleteById(id);
			return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}
	
	

}
