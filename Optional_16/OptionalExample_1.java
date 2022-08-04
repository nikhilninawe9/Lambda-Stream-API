package Optional_16;

import java.util.Optional;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class OptionalExample_1 {

	public static String getStudentName() {

		// Student student = StudentDataBase.studentSupplier.get();
		Student student = null;
		if (student != null) {
			return student.getName();
		} else {
			return null;
		}
	}

	public static Optional<String> getStudentNameOptional() {
		/*
		 * some methods automatically returns optional object, some we have to do it
		 * explicitly like below by using ofNullable
		 */
		Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		// Optional<Student> student = Optional.ofNullable(null);

		if (student.isPresent()) {
			return student.map(Student::getName); // don't get confused this with streams map method. Both are
													// different.
		}
		return Optional.empty();
	}

	public static void main(String[] args) {

		if (getStudentNameOptional().isPresent()) {
			System.out.println(getStudentNameOptional().get());
		} else {
			System.out.println("Name is returned as empty.");
		}
	}

}
