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
public class MultiplierImpl_3 implements Multiplier_CreatingInterfaceWithDefaultStaticMethods_3 {

	@Override
	public int multiply(List<Integer> integerList) {
		return integerList.stream().reduce(1, (x, y) -> x * y);
	}

	/* Overriden method size() */
	public int size(List<Integer> intList) {
		System.out.println("Inside MultiplierImpl class");
		return intList.size();
	}

}
