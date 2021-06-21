package com.alpha.exam.exam.service;

import java.util.List;

import com.alpha.exam.exam.model.Product;

public interface IProductService {
	
	public List<String> getAllProducts(String continent);
	
	public void saveProduct(Product p);
	
	public void updateProduct(Product p);

}
