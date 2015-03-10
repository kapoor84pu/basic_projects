package com.data.db;

/**
 * @author neelam.kapoor
 * This class uses JDBC to read Customer table from SQL Developer(Oracle DB)
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainDB {
	
	private static final Logger logger = LoggerFactory.getLogger(MainDB.class)	;
	
	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static String DB_URL = "jdbc:oracle:thin:@oracle.fdmgroup.com:1521:xe";
	private static String DB_USERNAME = "neelamkapoor";
	private static String DB_PASSWORD = "Oracle101";
	static Connection dbConnection = null;

	public static void main(String[] args) {
		selectRecords();		
	}

	private static void selectRecords() {
		Connection dbConnection = null;
		Statement statement = null;
		String query = "select * from CUSTOMER";
		
		try {
			dbConnection = getConnection();
			statement = dbConnection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()){
				String customerName = resultSet.getString("CUSTOMERNAME");
				logger.info("Customer name is {}",customerName);
				System.out.println(customerName);
			}
			
		} catch (SQLException e) {
			logger.info("error while fetching results", e.getMessage());
		}
		
	}

	private static Connection getConnection() throws SQLException {
		Connection dbConnection = null;
		try {
			Class.forName(DB_DRIVER);
			dbConnection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return dbConnection;
	}

}
