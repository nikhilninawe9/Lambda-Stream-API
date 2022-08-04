package StreamTerminalOperations_14;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

import java.util.Comparator;
import java.util.Optional;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class StreamsMinbyMaxbyExample_4 {

	/* This will return the Student with condition */
	public static Optional<Student> minByExample() {
		return StudentDataBase.getAllStudents().stream().collect(minBy(Comparator.comparing(Student::getGpa)));
	}

	public static Optional<Student> maxByExample() {
		return StudentDataBase.getAllStudents().stream().collect(maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {
		System.out.println(minByExample());
		System.out.println(maxByExample());
	}
}
