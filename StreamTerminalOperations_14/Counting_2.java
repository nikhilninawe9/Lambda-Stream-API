package StreamTerminalOperations_14;

import static java.util.stream.Collectors.counting;

import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class Counting_2 {
	/* Return total number of students */
	public static long count() {
		return StudentDataBase.getAllStudents().stream().filter(s -> s.getGpa() >= 3.9).collect(counting());
	}

	public static void main(String[] args) {
		System.out.println(count());
	}
}
