package StreamTerminalOperations_14;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class StreamGroupingByExample_6 {

	public static Map<String, List<Student>> groupStudentsByGender() {
		Map<String, List<Student>> studentsWithGender = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGender));
		return studentsWithGender;
	}

	public static Map<String, List<Student>> customizedGroupingBy() {
		Map<String, List<Student>> studentsWithGender = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(s -> s.getGpa() >= 3.8 ? "Outstanding" : "Average"));
		return studentsWithGender;
	}

	public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1() {
		Map<Integer, Map<String, List<Student>>> studentsWithGender = StudentDataBase.getAllStudents().stream().collect(
				groupingBy(Student::getGradeLevel, groupingBy(s -> s.getGpa() >= 3.8 ? "Outstanding" : "Average")));
		return studentsWithGender;
	}

	public static Map<Integer, Integer> twoLevelGrouping_2() {
		Map<Integer, Integer> studentsWithGender = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getGradeLevel, summingInt(Student::getNoteBooks)));
		return studentsWithGender;
	}

	public static Map<String, Integer> twoLevelGrouping_3() {
		Map<String, Integer> studentsWithGender = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getName, summingInt(Student::getNoteBooks)));
		return studentsWithGender;
	}

	public static LinkedHashMap<String, Set<Student>> threeArgumentsGroupBy() {
		LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents().stream()
				.collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
		return studentLinkedHashMap;
	}

	public static void main(String[] args) {
		System.out.println(groupStudentsByGender());
		System.out.println(customizedGroupingBy());
		System.out.println(twoLevelGrouping_1());
		System.out.println(twoLevelGrouping_2());
		System.out.println(twoLevelGrouping_3());
		System.out.println(threeArgumentsGroupBy());
	}
}
