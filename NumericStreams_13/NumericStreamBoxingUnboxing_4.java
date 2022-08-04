package NumericStreams_13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxing_4 {
	/* boxing means conversion of int to Integer wrapper class */
	public static List<Integer> boxing() {
		List<Integer> l = IntStream.rangeClosed(1, 30).boxed().collect(Collectors.toList());
		return l;
	}

	/* unboxing means conversion of Integer wrapper class to int type */
	public static int unBoxing() {
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		int i = l.stream().mapToInt(Integer::intValue).sum();
		return i;
	}

	public static void main(String[] args) {
		System.out.println(boxing());
		System.out.println(unBoxing());
	}
}
