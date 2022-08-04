package Lambdas_2_Consumers_BiConsumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerRunner1 {
	static Consumer<Student> std1 = (s) -> System.out.println(s.getName());
	static Consumer<Student> std2 = (s) -> System.out.println(s.getActivities());
	static Consumer<Student> std = (s) -> System.out.println(s);

	public static void basicConsumerEx() {

		Consumer<String> consumer = (str1) -> {
			System.out.println(str1.toUpperCase());
		};
		consumer.accept("i am the game");
	}

	public static void printStudent() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(std);
	};

	public static void printNameAndActivities() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(std1);
		students.forEach(std2);
		/* and then method */
		students.forEach(std1.andThen(std2));/* Consumer chaining */
	}

	public static void printNameAndActivitiesWithConditions() {
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student) -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				std1.andThen(std2).accept(student);
			}
		});
	}

	public static void main(String[] args) {
		basicConsumerEx();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		printStudent();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		printNameAndActivities();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		printNameAndActivitiesWithConditions();
	}

}
