package com.cg.fms.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.advices.ResourceNotFoundException;
import com.cg.fms.dao.IProductDao;
import com.cg.fms.dto.Product;

@Service
public class ProductServiceImpl implements  ProductService{
	
	@Autowired
	IProductDao repo;

	@Override
	public Product getProduct(int productId) throws Exception {
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Product id is not present in the database");
		return repo.findById(productId).orElseThrow(s1);
	}

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
			repo.save(product);
			return "added";
	}

	@Override
	public String updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Product id is not present in the database");
			Product p=repo.findById(product.getProductId()).orElseThrow(s1);
			return "updated";
	}

	@Override
	public String deleteProduct(int productId) throws Exception {
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Product id is not present in the database");
		Product p=repo.findById(productId).orElseThrow(s1);
		//if(p != null) {
			repo.delete(p);
		//}
			return "deleted";
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
