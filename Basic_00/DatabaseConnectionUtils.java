package Basic_00;
/**
 * @Author : bunty
 * Copyright (C) 2022 Bunty - All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of My license, which unfortunately won't be
 * written for another century.
 *
 * You should have received a copy of the My license with
 * this file. If not, please write to: nikhilninawe.in1@gmail.com.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author : bunty
 * @date : Jun 14, 2022
 * 
 */
public class DatabaseConnectionUtils {

	static Connection conn = null;
	static Statement statement = null;
	static ResultSet rs = null;

	public static Connection getDbConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/classicmodels?allowPublicKeyRetrieval=true&useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=CTT";
		String username = "root";
		String password = "Acerfaraari@123";
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
}
