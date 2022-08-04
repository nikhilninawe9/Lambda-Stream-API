package Basic_00;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class Practice {

	static Predicate<Student> gpaCheck = (s) -> s.getGradeLevel() <= 3;

	public static Function<List<Student>, List<String>> listStd = (studentList) -> {
		List<String> sList = new ArrayList();
		studentList.forEach(s -> {
			if (gpaCheck.test(s)) {
				sList.add(s.getName());
			}
		});
		return sList;
	};

	public static void main(String[] args) {
		Consumer<Student> studentName = (s) -> System.out.println(s.getName());
		Consumer<Student> studentActivity = (s) -> System.out.println(s.getActivities());
		Predicate<Student> gpaCheck = (s) -> s.getGradeLevel() < 3;

		// listing all the students
		List<Student> students = StudentDataBase.getAllStudents();

		// listing all the student names
//		students.forEach(studentName);

		// listing all the student names and activities
//		students.forEach(studentName.andThen(studentActivity));

		// listing names and activities with conditions
//		students.forEach(s -> {
//			if (s.getGpa() > 2 && s.getGradeLevel() > 3) {
//				System.out.println(s);
//			}
//		});

		System.out.println(listStd.apply(students));

		Long sAct = students.stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().count();
		System.out.println(sAct);

		List<Student> sL = students.stream().sorted(Comparator.comparing(Student::getGradeLevel)).collect(toList());
		System.out.println(sL);
		System.out.println(students.stream().filter(s -> s.getGender().equalsIgnoreCase("Female")).collect(toList()));

		System.out.println();
	}
}
