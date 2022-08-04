package StreamOperation_11;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class StreamsComparatorExample_3 {

	public static List<Student> inSortedOrderByNames() {
		List<Student> l = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(toList());
		return l;
	}

	/* Ascending */
	public static List<Student> inSortedOrderByGpa() {
//		List<Student> l = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
//				.collect(toList());
		Function<Student, Double> gpa = (s) -> s.getGpa();
		List<Student> l = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(gpa)).collect(toList());
		return l;
	}

	/* Descending */
	public static List<Student> inSortedOrderByGpaDesc() {
//		List<Student> l = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
//				.collect(toList());
		Function<Student, Double> gpa = (s) -> s.getGpa();
		List<Student> l = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(gpa).reversed())
				.collect(toList());
		return l;
	}

	public static void main(String[] args) {
//		System.out.println(inSortedOrderByNames());
//		System.out.println("Students sorted by names");
//		inSortedOrderByNames().forEach(System.out::println);
//		inSortedOrderByGpa().forEach(System.out::println);
		inSortedOrderByGpaDesc().forEach(System.out::println);
	}
}
