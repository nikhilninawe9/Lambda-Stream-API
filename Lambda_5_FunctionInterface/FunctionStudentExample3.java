package Lambda_5_FunctionInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;
import Lambdas_3_Predicate.PredicateStudentExample2;

public class FunctionStudentExample3 {
	static Function<List<Student>, Map<String, Double>> studentFunction = (students) -> {
		Map<String, Double> studentGradeMap = new HashMap<>();
		students.forEach(student -> {
			if (PredicateStudentExample2.checkGpa.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGradeMap;
	};

	public static void main(String[] args) {
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
	}
}
