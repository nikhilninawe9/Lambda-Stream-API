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

import java.util.List;

/**
 * @author : bunty
 * @date : Aug 2, 2022
 * 
 */
public interface Multiplier_CreatingInterfaceWithDefaultStaticMethods_3 {

	/*
	 * Before java8 interface never had any method implementations but from java8 it
	 * is possible in the form of default and static methods.
	 */
	int multiply(List<Integer> integerList);

	default int size(List<Integer> intList) {
		System.out.println("Inside multiplier interface");
		return intList.size();
	}

	static boolean isEmpty(List<Integer> intList) {
		return intList != null && intList.size() > 0;
	}
}
