package com.trg.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.trg.dao.ItfDao;
import com.trg.mapper.RowMapper;
import com.trg.utils.DatabaseUtil;

public class Dao<T> implements ItfDao<T> {
	private DatabaseUtil databaseConnection = DatabaseUtil.getInstance();
	
	@Override
	public List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		List<T> result = new ArrayList<>();
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = databaseConnection.getConnection();
			ps = connection.prepareStatement(sql);
			setParameters(ps, parameters);
			rs = ps.executeQuery();
			// set parameters for PreparedStatement.

			while (rs.next()) {
				result.add(rowMapper.mapRow(rs));
			}
			return result;
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}

				if (ps != null) {
					ps.close();
				}

				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean query(String sql, Object... parameters) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = databaseConnection.getConnection();
			ps = connection.prepareStatement(sql);
			setParameters(ps, parameters);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}

				if (ps != null) {
					ps.close();
				}

				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private void setParameters(PreparedStatement ps, Object... parameters) throws SQLException {
		for (int i = 0; i < parameters.length; i++) {
			if (parameters[i] instanceof Integer) {
				ps.setInt(i + 1, (Integer) parameters[i]);
			} else if (parameters[i] instanceof String) {
				ps.setString(i + 1, (String) parameters[i]);
			} else if (parameters[i] instanceof Long) {
				ps.setLong(i + 1, (Long) parameters[i]);
			}
		}
	}
}
