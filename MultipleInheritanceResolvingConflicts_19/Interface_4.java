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

/**
 * @author : bunty
 * @date : Aug 2, 2022
 * 
 */
public interface Interface_4 {
	default void methodA() {
		System.out.println("Inside method A: " + Interface_4.class);
	}
}
