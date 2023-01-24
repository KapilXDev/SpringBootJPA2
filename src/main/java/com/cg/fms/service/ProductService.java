package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Product;

public interface ProductService {
	public Product getProduct(int productId) throws Exception;

	public String addProduct(Product product);

	public String updateProduct(Product product) throws Exception;

	public String deleteProduct(int productId) throws Exception;
	
	public List<Product> getAllProducts();
}
