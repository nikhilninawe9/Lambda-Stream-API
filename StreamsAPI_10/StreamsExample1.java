package StreamsAPI_10;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class StreamsExample1 {
	public static void main(String[] args) {
		/* Student names and activities in map */
		Map<String, List<String>> list = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(list);

		/* Student names and activities in map with conditions */
		Map<String, List<String>> stuList = StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel() >= 3)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(stuList);

		/* Student names and activities in map with conditions with predicate */
		Predicate<Student> sPredicate = (student -> student.getGradeLevel() >= 3);
		Predicate<Student> sPredicateGpa = (student -> student.getGpa() >= 3.9);
		Map<String, List<String>> stuList1 = StudentDataBase.getAllStudents().stream().filter(sPredicate)
				.filter(sPredicateGpa).collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(stuList1);
	}
}
