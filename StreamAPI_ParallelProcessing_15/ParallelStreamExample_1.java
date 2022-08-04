package StreamAPI_ParallelProcessing_15;

import java.util.stream.IntStream;

public class ParallelStreamExample_1 {

	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 100000).sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100000).parallel().sum();
	}

	public static void main(String[] args) {
		System.out.println(sumSequentialStream());
		System.out.println(sumParallelStream());
	}

}
