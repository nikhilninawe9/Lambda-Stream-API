package Lambdas_9_ConstructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import Lambdas_2_Consumers_BiConsumer.Student;

public class ConstructorReference {

	static Supplier<Student> studentSupplier = Student::new;
	static Function<String, Student> studentFunction = Student::new;// it must have constructor with 1 argument String

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentFunction.apply("abc"));
	}
}
