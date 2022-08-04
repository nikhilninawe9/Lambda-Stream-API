package StreamTerminalOperations_14;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class Mapping_3 {

	public static List<String> mapping_1() {
		List<String> namesList = StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName, toList()));
		return namesList;
	}

	public static Set<String> mapping_2() {
		Set<String> namesList = StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName, toSet()));
		return namesList;
	}

	public static void main(String[] args) {
		System.out.println(mapping_1());
		System.out.println(mapping_2());
	}
}
