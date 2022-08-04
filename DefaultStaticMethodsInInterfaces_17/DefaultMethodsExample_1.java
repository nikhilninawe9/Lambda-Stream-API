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

package DefaultStaticMethodsInInterfaces_17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : bunty
 * @date : Aug 2, 2022
 * 
 */
public class DefaultMethodsExample_1 {
	public static void main(String[] args) {

		// Before java8 interface never had any method implementations but from java8 it
		// is possible in the form of default and static methods.
		List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Eric", "Mike");
		List<Integer> intList = Arrays.asList(1, 4, 3, 7, 8, 5, 3, 2, 8);
		/*
		 * Collections.sort(stringList); System.out.println("Sorted list : " +
		 * stringList);
		 */

		stringList.sort(Comparator.naturalOrder());

		System.out.println("Sorted list Natural Order : " + stringList);

		stringList.sort(Comparator.reverseOrder());

		System.out.println("Reverse Sorted list : " + stringList);

		intList.sort(Comparator.naturalOrder());

		System.out.println("Sorted list Natural Order : " + intList);

		intList.sort(Comparator.reverseOrder());

		System.out.println("Reverse Sorted list : " + intList);
	}
}
