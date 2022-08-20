package com.trg.dao.imp;

import java.util.List;

import com.trg.dao.IProductDao;
import com.trg.mapper.ProductMapper;
import com.trg.model.Product;

public class ProductDao extends Dao<Product> implements IProductDao {

	@Override
	public List<Product> findAll() {
		String sql = "select * from products";
		return query(sql, new ProductMapper());
	}
	
	@Override
	public List<Product> findAll(String orderBy, String orderType, int limit) {
		StringBuilder sql = new StringBuilder("select * from products");
		sql.append(" order by " + orderBy + " " + orderType);
		sql.append(" limit " + limit);
		return query(sql.toString(), new ProductMapper());
	}

	@Override
	public Product findByProductId(int id) {
		String sql = "select * from products where id = ?";
		List<Product> result = query(sql, new ProductMapper(), id);
		return result.isEmpty() ? null : result.get(0);
	}

	@Override
	public List<Product> findByProductName(String name) {
		name = name + "%";
		String sql = "select * from products where productName like ?";
		return query(sql, new ProductMapper(), name);
	}
	
	public static void main(String[] args) {
		try {
			List<Product> pl = (new ProductDao().findByProductName("%fLy%"));
			System.out.println(pl.size());
			for (Product p : pl) {
				System.out.println(p);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
