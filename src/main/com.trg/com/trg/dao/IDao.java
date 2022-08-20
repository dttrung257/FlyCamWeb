package com.trg.dao;

import java.util.List;

import com.trg.mapper.RowMapper;

public interface IDao<T> {
	
	List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
}
