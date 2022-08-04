package NumericStreams_13;

import java.util.stream.IntStream;

public class NumericStreamRangesExamples_2 {

	public static void main(String[] args) {
		IntStream num1 = IntStream.range(1, 50);
		// System.out.println(num1.count());
		IntStream num2 = IntStream.rangeClosed(1, 50);
		num1.forEach(v -> System.out.print(v + " "));
		System.out.println();
		num2.forEach(v -> System.out.print(v + " "));

		System.out.println();
		IntStream.range(1, 50).asDoubleStream().forEach(s -> System.out.print(s + " "));

	}
}
