package StreamAPI_ParallelProcessing_15;

import java.util.stream.IntStream;

public class WhenNotToUseParallelStream_5 {

	public static void sequentialTotal() {
		Sum_Reference_for_WNTUPS_5 sum = new Sum_Reference_for_WNTUPS_5();
		IntStream.rangeClosed(1, 1000).forEach(sum::performSum);
		System.out.println(sum.getTotal());
	}

	public static void parallelTotal() {
		Sum_Reference_for_WNTUPS_5 sum = new Sum_Reference_for_WNTUPS_5();
		IntStream.rangeClosed(1, 1000).parallel().forEach(sum::performSum);
		System.out.println(sum.getTotal());
	}

	public static void main(String[] args) {
		sequentialTotal();// this is giving same result of summation of 1 to 1000
		parallelTotal();// this is giving different results
	}
	/*
	 * Note: If we have any mutable variable then we must not use parallel stream
	 */
}
