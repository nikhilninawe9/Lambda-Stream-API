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
public class Client123 implements Interface_1, Interface_2, Interface_3 {

	public void methodA() {
		System.out.println("Inside method A: " + Client123.class);
	}

	public static void main(String[] args) {
		Client123 client123 = new Client123();
		client123.methodA();// ovverriden method invokes from chile interface
		client123.methodB();
		client123.methodC();
	}

}
