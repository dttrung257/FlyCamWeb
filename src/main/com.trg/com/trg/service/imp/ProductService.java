package com.trg.service.imp;

import java.util.List;

import com.trg.dao.IProductDao;
import com.trg.dao.imp.ProductDao;
import com.trg.model.Product;
import com.trg.service.IProductService;

public class ProductService implements IProductService {
	private IProductDao productDao = ProductDao.getInstance();
	private static ProductService productService = null;
	
	private ProductService() {
	}
	
	public static ProductService getInstance() {
		if (productService == null) {
			productService = new ProductService();
		}
		return productService;
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
