package StreamOperation_11;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class MapFilterReduce_6 {

	private static int numberOfNotebooks() {
		/*
		 * this will give total number of notebooks int numberOfNotebooks =
		 * StudentDataBase.getAllStudents().stream().map(Student::getNotebooks).reduce(
		 * 0, (a, b) -> a + b);
		 * 
		 * OR
		 */
		int numberOfNotebooks = StudentDataBase.getAllStudents().stream()
				.filter((s) -> s.getActivities().contains("soccer"))
				.filter(s -> s.getGender().equalsIgnoreCase("FEMALE")).map(Student::getNoteBooks)
				.reduce(0, Integer::sum);
		return numberOfNotebooks;
	}

	public static void main(String[] args) {
		System.out.println(numberOfNotebooks());
	}
}
