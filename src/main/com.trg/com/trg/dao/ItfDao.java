package com.trg.dao;

import java.util.List;

import com.trg.mapper.RowMapper;

public interface ItfDao<T> {
	
	List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	
	boolean query(String sql, Object... parameters);
}
