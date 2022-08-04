package StreamOperation_11;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class StreamMapExample_1 {

	public static Set<String> nameList1() {
		Set<String> names = StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
				.collect(toSet());
		return names;
	}

	public static List<String> nameList2() {
		List<String> names = StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
				.collect(toList());
		return names;
	}

	public static void main(String[] args) {
		System.out.println(nameList1());
		System.out.println(nameList2());
	}
}
