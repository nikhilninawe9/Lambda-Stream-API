package StreamAPI_ParallelProcessing_15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WhenNotToUseParallelStream_4 {

	public static int sequentialSum(List<Integer> intList) {
		long start = System.currentTimeMillis();
		int sum = intList.stream().reduce(0, (x, y) -> x + y);
		long end = System.currentTimeMillis();
		System.out.println("Time for sequential stream " + (end - start));
		return sum;
	}

	public static int parallelSum(List<Integer> intList) {
		long start = System.currentTimeMillis();
		int sum = intList.parallelStream().reduce(0, (x, y) -> x + y);
		long end = System.currentTimeMillis();
		System.out.println("Time for parallel stream " + (end - start));
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> integerList = IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList());
		System.out.println(sequentialSum(integerList));// Time for sequential stream 12
		System.out.println(parallelSum(integerList));// Time for sequential stream 20
		/*
		 * Reason: Parallel stream needs more time as compared to Sequential stream to
		 * perform the unboxing from integer into int
		 * 
		 */
	}
}
