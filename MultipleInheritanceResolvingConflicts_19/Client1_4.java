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

package MultipleInheritanceResolvingConflicts_19;

import MultipleInheritancePossible_18.Interface_1;

/**
 * @author : bunty
 * @date : Aug 2, 2022
 * 
 */
public class Client1_4 implements Interface_1, Interface_4 {

	/**
	 * Note: If we have to implements the multiple interfaces and both the interface
	 * have same method name and signature then compilation error will come which to
	 * override.
	 *
	 * Then the only way is we have to implement that method in the executable class
	 * only then only it will get executed properly..
	 */

	public void methodA() {
		System.out.println("Inside method A: " + Client1_4.class);
	}

	public static void main(String[] args) {
		new Client1_4().methodA();

	}

}
