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

package MultipleInheritancePossible_18;

/**
 * @author : bunty
 * @date : Aug 2, 2022
 * 
 */
public interface Interface_3 extends Interface_2 {
	default void methodC() {
		System.out.println("Inside method C");
	}
}
