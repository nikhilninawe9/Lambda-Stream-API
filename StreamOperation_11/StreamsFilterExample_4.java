package StreamOperation_11;

import static java.util.stream.Collectors.toList;

import java.util.List;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

/*Filter will take predicated as an input*/
public class StreamsFilterExample_4 {

	public static List<Student> filterStudents() {
		List<Student> l = StudentDataBase.getAllStudents().stream()/* Stream<Student> */
				.filter((student) -> student.getGender().equals("female"))/* Stream<Student> */
				.collect(toList());
		return l;
	}

	/* Count the female students */
	public static long femaleStudentsCount() {
		long l = StudentDataBase.getAllStudents().stream()/* Stream<Student> */
				.filter((student) -> student.getGender().equals("female")).count();/* Stream<Student> */
		return l;
	}

	public static void main(String[] args) {
//		System.out.println(filterStudents());
//		System.out.println(femaleStudentsCount());
//		filterStudents().forEach(System.out::println);
		filterStudentsCustomized().forEach(System.out::println);
	}

	/* student with aerobics activity */
	public static List<Student> filterStudentsCustomized() {
		List<Student> l = StudentDataBase.getAllStudents().stream()/* Stream<Student> */
				.filter((student) -> student.getActivities().contains("aerobics"))/* Stream<Student> */
				.collect(toList());
		return l;
	}

	public static List<Student> filterStudentsCustomized2() {
		List<Student> l = StudentDataBase.getAllStudents().stream()/* Stream<Student> */
				.filter((student) -> student.getActivities().contains("aerobics"))/* Stream<Student> */
				.collect(toList());
		return l;
	}
}
