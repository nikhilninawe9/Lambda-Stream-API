package Lambdas_2_Consumers_BiConsumer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerRunner2 {
	public static void dummy() {
		BiConsumer<String, String> bc = (a, b) -> System.out.println("A is " + a + " b is " + b);
		bc.accept("nikhil", "ansh");

		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			int c = a * b;
			System.out.println("Multiplication " + c);
		};
		multiply.accept(1, 2);
		BiConsumer<Integer, Integer> divide = (a, b) -> {
			int c = a / b;
			System.out.println("Division " + c);
		};
		divide.accept(12, 2);

		multiply.andThen(divide).accept(200, 10);
	}

	public static void nameAndActivities() {
		List<Student> students = StudentDataBase.getAllStudents();
		BiConsumer<String, List<String>> biConsumer = (name, listActivities) -> {
			System.out.println(name + " " + listActivities);
		};
		students.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {
		dummy();
		nameAndActivities();
	}

}
