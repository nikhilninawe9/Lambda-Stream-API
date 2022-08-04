package StreamTerminalOperations_14;
import java.util.stream.Collectors;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class Joining_1 {

	public static String joining_1() {
		String joinedNames = StudentDataBase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining());
		return joinedNames;
	}

	public static String joining_2() {
//		String joinedNames = StudentDataBase.getAllStudents().stream().map(Student::getName)
//				.collect(Collectors.joining("-"));

		String joinedNames = StudentDataBase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining("-", "/", "/"));
		return joinedNames;
	}

	public static void main(String[] args) {
		System.out.println(joining_1());
		System.out.println(joining_2());
	}
}
