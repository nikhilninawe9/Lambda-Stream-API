package StreamOperation_11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import Lambdas_2_Consumers_BiConsumer.Student;
import Lambdas_2_Consumers_BiConsumer.StudentDataBase;

public class StreamsReduceExample5 {

	public static int performMultiplication(List<Integer> integerList) {
		int result = integerList.stream().reduce(1, (a, b) -> a * b);
		return result;
	}

	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		Optional<Integer> result = integerList.stream().reduce((a, b) -> a * b);
		return result;
	}

	public static Optional<Student> getHighestGpaStudent() {
		Optional<Student> result = StudentDataBase.getAllStudents().stream()
				.reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(performMultiplication(Arrays.asList(321, 33, 5, 7)));
		System.out.println(performMultiplicationWithoutIdentity(Arrays.asList(321, 33, 5, 7)).get());
//		System.out.println(performMultiplicationWithoutIdentity(new ArrayList<Integer>()).isPresent());
//		System.out.println(performMultiplicationWithoutIdentity(new ArrayList<Integer>()).get());
		System.out.println(getHighestGpaStudent());
	}
}
