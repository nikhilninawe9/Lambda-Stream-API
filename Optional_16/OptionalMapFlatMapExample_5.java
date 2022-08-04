
package Optional_16;

import java.util.Optional;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class OptionalMapFlatMapExample_5 {
	public static void optionalFlatMap() {
		Optional<Student> studentOptional = StudentDataBase.getOptionalStudent();
		if (studentOptional.isPresent()) {
			Optional<Bike> bikeOptional = studentOptional.flatMap(Student::getBike); //
			System.out.println("bikeOptional : " + bikeOptional);
		}
	}

	public static void optionalMap() {
		Optional<Student> studentOptional = StudentDataBase.getOptionalStudent();

		if (studentOptional.isPresent()) {
			Optional<String> nameOptional = studentOptional.map(Student::getName); //
			System.out.println("nameOptional : " + nameOptional);
		}
	}

	public static void optionalFilter() {

		Optional<Student> studentOptional = StudentDataBase.getOptionalStudent()
				.filter(student -> student.getGpa() >= 4.3);

		studentOptional.ifPresent(student -> System.out.println(student));

	}

	public static void main(String[] args) {
		optionalFlatMap();
		optionalMap();
		optionalFilter();
	}
}
