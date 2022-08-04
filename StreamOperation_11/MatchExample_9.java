package StreamOperation_11;

import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

/*this will always returns boolean*/
public class MatchExample_9 {
	/* all the elements must match this condition then true owise false */
	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream().allMatch(s -> s.getGpa() >= 3.5);
	}

	/* any of the elements must match this condition then true owise false */
	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream().anyMatch(s -> s.getGpa() >= 3.4);
	}

	/* none of the elements must match this condition then true owise false */
	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream().noneMatch(s -> s.getGpa() == 3.7);
	}

	public static void main(String[] args) {
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(noneMatch());
	}
}
