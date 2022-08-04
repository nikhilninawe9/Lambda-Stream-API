package StreamsAPI_10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class DebuddingWithPeek3 {
	public static void main(String[] args) {
		/* Peek methd accepts the consumer */
//		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream().peek(student -> {
//			System.out.println(student);
//		}).filter(student -> student.getGradeLevel() >= 3)
//				.collect(Collectors.toMap(Student::getName, Student::getActivities));
//
//		System.out.println(studentMap);
//
//		List<Student> sList = StudentDataBase.getAllStudents();
//
//		Consumer<Student> cStudent = (student) -> {
//			double gpa = student.getGpa();
//			int grade = student.getGradeLevel();
//			double multiply = gpa * grade;
//			System.out.println("Multiplied value is " + multiply);
//		};
//
//		Map<String, List<String>> studentMap1 = StudentDataBase.getAllStudents().stream().peek(cStudent)
//				.filter(s -> s.getGpa() > 3).collect(Collectors.toMap(Student::getName, Student::getActivities));
//
//		System.out.println(studentMap1);

		/* To understand flow */
		Map<String, List<String>> studentMap2 = StudentDataBase.getAllStudents().stream().peek(student -> {
			System.out.println(student);
		}).filter(student -> student.getGradeLevel() >= 3.5)
				.peek(student -> System.out.println("After 1 filter grade level " + student))
				.filter(student -> student.getGpa() >= 3.5)
				.peek(student -> System.out.println("After 2 filter gpa level " + student))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentMap2);
	}
}
