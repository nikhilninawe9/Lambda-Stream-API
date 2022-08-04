package NumericStreams_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample_1 {
	public static int sumOfNNumbers() {
		List<Integer> integerList = Arrays.asList(1, 2, 3);
		int num = integerList.stream().reduce(0, (a, b) -> a + b);
		return num;
	}

	/* IntStream.range(50) returns instream of 49 elements from 1to49 */
	/* IntStream.rangeClosed(1, 50) returns instream of 50 elements from 1to49 */
	public static int sumOfIntNumbers() {
		return IntStream.range(1, 4).sum();
		// return IntStream.rangeClosed(1, 3).sum();
	}

	public static void main(String[] args) {
		System.out.println(sumOfNNumbers());
		System.out.println(sumOfIntNumbers());
	}
}
