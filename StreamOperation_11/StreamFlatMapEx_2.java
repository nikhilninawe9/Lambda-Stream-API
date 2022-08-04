package StreamOperation_11;

import static java.util.stream.Collectors.toList;

import java.util.List;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

/*whenever w have to map the collection then we use flatmap
 * behind the scene it is like Stream<List<String>>
 * 
 * distinct makes the unique element
 * */
public class StreamFlatMapEx_2 {
	public static List<String> printStudentActivities() {
		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).collect(toList());
		return studentActivities;
	}

	/* distinct makes the unique element */
	public static List<String> printStudentActivitiesWithDistinct() {
		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(toList());
		return studentActivities;
	}

	/* counting the activities */
	public static Long getStudentsActivitiesCount() {
		Long numberOfStudentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().count();
		return numberOfStudentActivities;
	}

	public static void main(String[] args) {
		System.out.println(printStudentActivities());
		System.out.println(printStudentActivitiesWithDistinct());
		System.out.println(getStudentsActivitiesCount());
	}
}
