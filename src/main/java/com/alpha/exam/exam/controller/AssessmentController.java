package com.alpha.exam.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alpha.exam.exam.constants.ProductAPIConstants;
import com.alpha.exam.exam.model.APIResponse;
import com.alpha.exam.exam.model.Product;
import com.alpha.exam.exam.service.IProductService;

@RestController
@RequestMapping(path=ProductAPIConstants.API)
public class AssessmentController {

	
	@Autowired
	private IProductService productService;
	
	@GetMapping(value = ProductAPIConstants.GET_PRODUCT)
	public ResponseEntity<APIResponse> getProduct(String continent)
	{
		if(productService.getAllProducts(continent).isEmpty())
			return new ResponseEntity<>(null,HttpStatus.OK);
		else
		return new ResponseEntity<>(new APIResponse(),HttpStatus.OK);
	}
	@PostMapping(value=ProductAPIConstants.SAVE_PRODUCT)
	public ResponseEntity<APIResponse> saveProduct(Product p)
	{
		productService.saveProduct(p);
		return new ResponseEntity<>(new APIResponse(),HttpStatus.CREATED);
		
	}
	@PutMapping(value=ProductAPIConstants.UPDATE_PRODUCT)
	public ResponseEntity<APIResponse> updateProduct(Product p)
	{
		productService.updateProduct(p);
		return new ResponseEntity<>(new APIResponse(),HttpStatus.OK);
	}
}
