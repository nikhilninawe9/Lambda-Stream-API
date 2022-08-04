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
import java.util.List;

/**
 * @author : bunty
 * @date : Aug 2, 2022
 * 
 */
public class MultiplierClient_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Multiplier_CreatingInterfaceWithDefaultStaticMethods_3 multiplier = new MultiplierImpl_3();
		List<Integer> intList = Arrays.asList(1, 3, 5);
		System.out.println("Result: " + multiplier.multiply(intList));
		System.out.println("Default method from interface and the size is: " + multiplier.size(intList));
		System.out.println(
				"Static methid isEmpty: " + Multiplier_CreatingInterfaceWithDefaultStaticMethods_3.isEmpty(intList));
	}

}
