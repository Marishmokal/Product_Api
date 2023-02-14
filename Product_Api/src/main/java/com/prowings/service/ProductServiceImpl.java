package com.prowings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.ProductDao;
import com.prowings.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;

	@Override
	public Product createProduct(Product product) {
		
		return dao.save(product);
	}
	
	
}
