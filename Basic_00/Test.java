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

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author : bunty
 * @date : Jun 14, 2022
 * 
 */
public class Test {

	public static Stream<Integer> c(int num) {
		return Stream.iterate(1, x -> x * (num - 1)).limit(num);
	}

	public static void main(String[] args) throws SQLException {
		Logicz l1 = new Logicz();

		List<Customer> cList = l1.getCustomers();
		List<Payments> pList = l1.getPayments();
//		List<String> cList1 = cList.stream().filter(c -> c.getCity().equals("NYC")).map(Customer::getCountry)
//				.collect(toList());

//		System.out.println(cList1);

//		double i = cList.stream().map(Customer::getCreditLimit).reduce(0.0, Double::sum);
//		double j = cList.stream().filter(c -> c.getCountry().equals("France")).map(Customer::getCreditLimit).reduce(1.0,
//				(a, b) -> a * b);
//
//		double findMax = cList.stream().map(Customer::getCreditLimit).reduce(0.0, (x, y) -> x > y ? x : y);
//		double findMin = cList.stream().map(Customer::getCreditLimit).reduce(0.0, (x, y) -> x < y ? x : y);
//		System.out.println(findMax);
//		System.out.println(findMin);
//
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//		System.out.println(numbers.stream().reduce(1, (a, b) -> a < b ? a : b));
//		Optional<Integer> t = numbers.stream().reduce((a, b) -> a < b ? a : b);
//		t.isPresent();
//
//		System.out.println();
//		List<Customer> qq = cList.stream().sorted(Comparator.comparing(Customer::getCity)).collect(toList());
//		qq.forEach(System.out::println);

		Optional<Customer> cu = cList.stream().filter(c -> c.getCreditLimit() == 0.00).findAny();
		if (cu.isPresent()) {
			System.out.println(cu.get());
		} else {
			System.out.println("Customer with credit limit 43300.00 is not present");
		}

		System.out.println(cList.stream().collect(groupingBy(Customer::getCountry)));
		System.out.println(cList.stream().collect(summingDouble(Customer::getCreditLimit)));

		Map<String, List<Customer>> sc = cList.stream()
				.collect(groupingBy(c -> c.getCreditLimit() >= 81700.00 ? "Platinum" : "Gold"));
		System.out.println(sc);
	}

}
