package com.trg.service.imp;

import java.util.List;

import com.trg.dao.ItfProductDao;
import com.trg.dao.imp.ProductDao;
import com.trg.model.Product;
import com.trg.service.ItfProductService;

public class ProductService implements ItfProductService {
	private ItfProductDao productDao = ProductDao.getInstance();
	private static ProductService productService = null;
	
	private ProductService() {
	}
	
	public static ProductService getInstance() {
		return productService == null ? new ProductService() : productService;
	}

	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}

	@Override
	public List<Product> findAll(String orderBy, String orderType, int limit) {
		// TODO Auto-generated method stub
		return productDao.findAll(orderBy, orderType, limit);
	}

	@Override
	public Product findByProductId(int id) {
		// TODO Auto-generated method stub
		return productDao.findByProductId(id);
	}

	@Override
	public List<Product> findByProductName(String name) {
		// TODO Auto-generated method stub
		return productDao.findByProductName(name);
	}

}
