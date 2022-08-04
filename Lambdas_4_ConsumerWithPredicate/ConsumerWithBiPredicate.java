package Lambdas_4_ConsumerWithPredicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class ConsumerWithBiPredicate {

	BiPredicate<Integer, Double> checking = (grade, gpa) -> grade >= 3 && gpa >= 3.9;

	/* BiConsumer */
	BiConsumer<String, List<String>> sBiConsumer = (name, activities) -> System.out.println(name + " " + activities);

	/* Consumer */
	Consumer<Student> studentConsumer = (student) -> {
		if (checking.test(student.getGradeLevel(), student.getGpa())) {
			sBiConsumer.accept(student.getName(), student.getActivities());
		}
	};

	public void printNameAndActivities(List<Student> std) {
		std.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		new ConsumerWithBiPredicate().printNameAndActivities(studentList);
	}
}
