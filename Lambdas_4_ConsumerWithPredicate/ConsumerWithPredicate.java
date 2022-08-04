package Lambdas_4_ConsumerWithPredicate;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class ConsumerWithPredicate {

	Predicate<Student> sGradeCond = (student) -> student.getGradeLevel() >= 3;
	Predicate<Student> sGpaCond = (student) -> student.getGpa() >= 3.9;

	/* BiConsumer */
	BiConsumer<String, List<String>> sBiConsumer = (name, activities) -> System.out.println(name + " " + activities);

	/* Consumer */
	Consumer<Student> studentConsumer = (student) -> {
		if (sGradeCond.and(sGpaCond).test(student)) {
			// System.out.println(student.getName() + " " + student.getActivities());
			/* OR */
			sBiConsumer.accept(student.getName(), student.getActivities());
		}
	};

	public void printNameAndActivities(List<Student> std) {
		std.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();
		new ConsumerWithPredicate().printNameAndActivities(studentList);
	}
}
