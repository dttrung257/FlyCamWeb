package com.trg.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.trg.model.Product;

public class ProductMapper implements RowMapper<Product> {
	private static ProductMapper productMapper = null;
	
	private ProductMapper() {
	}
	
	public static ProductMapper getInstance() {
		if (productMapper == null) {
			productMapper = new ProductMapper();
		}
		return productMapper;
	}

	@Override
	public Product mapRow(ResultSet rs) {
		Product p = new Product();
		try {
			p.setProductId(rs.getInt("id"));
			p.setProductName(rs.getString("productName"));
			p.setPrice(rs.getDouble("price"));
			p.setImageUrl(rs.getString("imageUrl"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
}
