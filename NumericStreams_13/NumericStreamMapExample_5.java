package NumericStreams_13;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamMapExample_5 {

	public static List<Integer> mapToObject() {
		return IntStream.rangeClosed(1, 5).mapToObj((i) -> {
			return new Integer(i);
		}).collect(toList());
	}

	public static Long mapToLong() {
		return IntStream.rangeClosed(1, 5).mapToLong((i) -> i).sum();
	}

	public static Double mapToDouble() {
		return IntStream.rangeClosed(1, 5).mapToDouble((i) -> i).sum();
	}

	public static void main(String[] args) {
		System.out.println(mapToObject());
		System.out.println(mapToLong());
		System.out.println(mapToDouble());
	}
}
