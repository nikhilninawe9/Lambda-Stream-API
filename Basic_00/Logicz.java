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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : bunty
 * @date : Jun 14, 2022
 * 
 */
public class Logicz {

	Connection conn = null;
	Statement statement = null;
	ResultSet resultSet = null;

	/* Get customer by name */
	public String getCustomerByName(String name, Customer customer) throws SQLException {
		conn = DatabaseConnectionUtils.getDbConnection();
		statement = conn.createStatement();
		String query = "select * from customers where customerName = '" + name + "'";
		resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			customer.setCustomerName(resultSet.getString("customerName"));
			customer.setPostamCode(resultSet.getString("postalCode"));
		}
		conn.close();
		return "Customer with name " + customer.getCustomerName() + " and postal code is " + customer.getPostamCode();
	}

	/* Get customer by customerNumber */
	public String getCustomerByCustNumber(int customerNumber, Customer customer) throws SQLException {
		conn = DatabaseConnectionUtils.getDbConnection();
		statement = conn.createStatement();
		String query = "select * from customers where customerNumber = '" + customerNumber + "'";
		resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			customer.setCustomerName(resultSet.getString("customerName"));
			customer.setPostamCode(resultSet.getString("postalCode"));
		}
		conn.close();
		return "Customer with name " + customer.getCustomerName() + " and email " + customer.getPostamCode();
	}

	/* Get all the customers */
	public List<Customer> getCustomers() throws SQLException {
		conn = DatabaseConnectionUtils.getDbConnection();
		statement = conn.createStatement();
		String query = "select * from customers";
		resultSet = statement.executeQuery(query);
		List<Customer> cList = new ArrayList<>();
		Customer customer = null;
		while (resultSet.next()) {
			customer = new Customer();
			customer.setCustomerName(resultSet.getString("customerName"));
			customer.setPostamCode(resultSet.getString("postalCode"));
			customer.setPhone(resultSet.getString("phone"));
			customer.setAddressLine(resultSet.getString("addressLine1"));
			customer.setCity(resultSet.getString("city"));
			customer.setState(resultSet.getString("state"));
			customer.setCountry(resultSet.getString("country"));
			customer.setSalesRepEmployeeNumber(resultSet.getString("salesRepEmployeeNumber"));
			customer.setCreditLimit(resultSet.getDouble("creditLimit"));
			cList.add(customer);
		}
		conn.close();
		return cList;
	}

	public int deleteCustomer(String name) throws SQLException {
		conn = DatabaseConnectionUtils.getDbConnection();
		statement = conn.createStatement();
		int i = statement.executeUpdate("delete from customers where customerName = '" + name + "'");
		return i;
	}

	public void updateCustomer(String name, int id) throws SQLException {
		conn = DatabaseConnectionUtils.getDbConnection();
		statement = conn.createStatement();
		statement.executeUpdate("update customers set customerName='" + name + "' where customerNumber='" + id + "'");
	}

	public int enterData(int id, String name) throws SQLException {
		conn = DatabaseConnectionUtils.getDbConnection();
		PreparedStatement ps = conn.prepareStatement("insert into xx values(" + id + ",'" + name + "')");
		int i = ps.executeUpdate();
		return i;
	}

	/* Get all the customers */
	public List<Payments> getPayments() throws SQLException {
		conn = DatabaseConnectionUtils.getDbConnection();
		statement = conn.createStatement();
		String query = "select * from payments";
		resultSet = statement.executeQuery(query);
		List<Payments> pList = new ArrayList<>();
		Payments payments = null;
		while (resultSet.next()) {
			payments = new Payments();
			payments.setCustomerNumber(resultSet.getString("customerNumber"));
			payments.setAmount(resultSet.getString("checkNumber"));
			payments.setCheckNumber(resultSet.getString("paymentDate"));
			payments.setPaymentDate(resultSet.getString("amount"));
			pList.add(payments);
		}
		conn.close();
		return pList;
	}
}
