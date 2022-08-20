package com.trg.service;

import java.util.List;

import com.trg.model.Product;

public interface IProductService {
	List<Product> findAll();

	List<Product> findAll(String orderBy, String orderType, int limit);

	Product findByProductId(int id);

	List<Product> findByProductName(String name);
}
