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

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

/**
 * @author : bunty
 * @date : Aug 2, 2022
 * 
 */
public class SortUsingComparator_2 {

	static Consumer<Student> studentConsumer = (s -> System.out.println(s));
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
	static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

	/* Sorting by name */
	public static void sortByName(List<Student> sList) {
		System.out.println("After sort By Name");
		sList.sort(nameComparator);
		sList.forEach(studentConsumer);
	}

	/* Sorting by gpa */
	public static void sortByGpa(List<Student> sList) {
		System.out.println("After sort BY Gpa");
		sList.sort(gpaComparator);
		sList.forEach(studentConsumer);
	}

	/* Sorting with 2 different parameters */
	public static void comparatorChaining(List<Student> sList) {
		System.out.println("After Comparator Chaining");
		sList.sort(gradeComparator.thenComparing(nameComparator));
		sList.forEach(studentConsumer);
	}

	/*
	 * When the collection has any null values then how we will sort it? When null
	 * object comes then how do we handle.
	 * 
	 * In this case null pointer exception never happens
	 */
	public static void sortWithNullValues(List<Student> sList) {
		Comparator<Student> sComparator = Comparator.nullsFirst(nameComparator);
		sList.sort(sComparator);
		sList.forEach(studentConsumer);
	}

	public static void main(String[] args) {

		List<Student> sList = StudentDataBase.getAllStudents();
		// System.out.println("Before sort");
		// sList.forEach(studentConsumer);
		/* Sorting by name */
		// sortByName(sList);
		/* Sorting by gpa */
		// sortByGpa(sList);
		sortWithNullValues(sList);
	}

}
