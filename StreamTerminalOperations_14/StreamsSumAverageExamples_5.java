package StreamTerminalOperations_14;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class StreamsSumAverageExamples_5 {

	public static int sumOfAllNotebooks() {
		int numOfNotebooks = StudentDataBase.getAllStudents().stream().collect(summingInt(Student::getNoteBooks));
		return numOfNotebooks;
	}

	public static double averageOfAllNotebooks() {
		double numOfNotebooks = StudentDataBase.getAllStudents().stream().collect(averagingInt(Student::getNoteBooks));
		return numOfNotebooks;
	}

	public static void main(String[] args) {
		System.out.println(sumOfAllNotebooks());
		System.out.println(averageOfAllNotebooks());
	}
}
