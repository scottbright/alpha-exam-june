package com.alpha.exam.exam.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.exam.exam.model.Product;

@RestController
@RequestMapping(path="")
public class AssessmentController {

	
	public ResponseEntity<String> getProduct(String continent)
	{
		return null;
		
	}
	public ResponseEntity<String> saveProduct(Product p)
	{
		return null;
		
	}
	public ResponseEntity<String> updateProduct(Product p)
	{
		return null;
	}
}
