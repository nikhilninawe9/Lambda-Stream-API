package Lambdas_7_Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class Supplier1 {
	/*
	 * it returns object of class but doesnt take any input
	 * 
	 */
	static Supplier<Student> studentSupplier = () -> {
		return new Student("Anil", 3, 4.3, "male", Arrays.asList("swimming", "kites"));
	};
	static Supplier<List<Student>> studentSupplierList = () -> StudentDataBase.getAllStudents();

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentSupplierList.get());
	}

}
