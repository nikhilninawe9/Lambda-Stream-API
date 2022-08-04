package Lambda_5_FunctionInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;
import Lambdas_3_Predicate.PredicateStudentExample2;

public class BiFunction4 {
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunctionStudent = (students,
			studentsPredicates) -> {
		Map<String, Double> studentData = new HashMap<String, Double>();
		students.forEach(student -> {
			if (studentsPredicates.test(student)) {
				studentData.put(student.getName(), student.getGpa());
			}
		});
		return studentData;
	};

	public static void main(String[] args) {
		System.out
				.println(biFunctionStudent.apply(StudentDataBase.getAllStudents(), PredicateStudentExample2.checkGpa));
	}
}
