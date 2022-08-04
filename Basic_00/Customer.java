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

/**
 * @author : bunty
 * @date : Jun 16, 2022
 * 
 */
public class Customer {
	private String customerName;
	private String postamCode;
	private String phone;
	private String addressLine;
	private String city;
	private String state;
	private String country;
	private String salesRepEmployeeNumber;
	private Double creditLimit;

	/**
	 * @param customerName
	 * @param postamCode
	 * @param phone
	 * @param addressLine
	 * @param city
	 * @param state
	 * @param country
	 * @param salesRepEmployeeNumber
	 * @param creditLimit
	 */
	public Customer(String customerName, String postamCode, String phone, String addressLine, String city, String state,
			String country, String salesRepEmployeeNumber, Double creditLimit) {
		super();
		this.customerName = customerName;
		this.postamCode = postamCode;
		this.phone = phone;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.country = country;
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
		this.creditLimit = creditLimit;
	}

	/**
	 * 
	 */
	public Customer() {
		super();
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the postamCode
	 */
	public String getPostamCode() {
		return postamCode;
	}

	/**
	 * @param postamCode the postamCode to set
	 */
	public void setPostamCode(String postamCode) {
		this.postamCode = postamCode;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the addressLine
	 */
	public String getAddressLine() {
		return addressLine;
	}

	/**
	 * @param addressLine the addressLine to set
	 */
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the salesRepEmployeeNumber
	 */
	public String getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}

	/**
	 * @param salesRepEmployeeNumber the salesRepEmployeeNumber to set
	 */
	public void setSalesRepEmployeeNumber(String salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}

	/**
	 * @return the creditLimit
	 */
	public Double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerName=");
		builder.append(customerName);
		builder.append(", postamCode=");
		builder.append(postamCode);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", addressLine=");
		builder.append(addressLine);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", country=");
		builder.append(country);
		builder.append(", salesRepEmployeeNumber=");
		builder.append(salesRepEmployeeNumber);
		builder.append(", creditLimit=");
		builder.append(creditLimit);
		builder.append("]");
		return builder.toString();
	}

}
