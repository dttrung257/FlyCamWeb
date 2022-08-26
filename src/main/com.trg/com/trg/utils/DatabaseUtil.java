package com.trg.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	private static DatabaseUtil databaseConnection = null;
	
	private DatabaseUtil() {
	}
	
	public static DatabaseUtil getInstance() {
		return (databaseConnection == null) ? new DatabaseUtil() : databaseConnection;
	}
	
	public Connection getConnection() {
		final String url = "jdbc:mysql://localhost:3306/demo_web";
		final String user = "root";
		final String password = "1234567";
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
