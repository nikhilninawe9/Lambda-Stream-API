package StreamAPI_ParallelProcessing_15;

import java.util.List;
import java.util.stream.Collectors;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class ParallelStreamPipeline_3 {

	/* Activities with sequential call */
	public static List<String> sequentialStudentActivities() {
		long start = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println("Duration time of execution for sequential call " + (end - start));
		return studentActivities;
	}

	/* Activities with parallel call */
	public static List<String> parallelStudentActivities() {
		long start = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().parallelStream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		long end = System.currentTimeMillis();
		System.out.println("Duration time of execution for parallel call " + (end - start));
		return studentActivities;
	}

	public static void main(String[] args) {
		System.out.println(sequentialStudentActivities());
		System.out.println(parallelStudentActivities());
	}
}
