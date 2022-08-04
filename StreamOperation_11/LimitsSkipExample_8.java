package StreamOperation_11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*With limit we can decide the range of collection for reduce operations*/
public class LimitsSkipExample_8 {
	/* Here limit(2) means it will consider only 2 elements first */
	public static Optional<Integer> limit() {
		List<Integer> l = Arrays.asList(21, 3, 44, 21, 1, 9);
		Optional<Integer> max = l.stream().limit(2).reduce((a, b) -> a > b ? a : b);
		return max;
	}

	/* Here skip(3) means it will skip first 3 elements */
	public static Optional<Integer> skip() {
		List<Integer> l = Arrays.asList(21, 3, 44, 3, 1, 79);
		Optional<Integer> max = l.stream().skip(3).reduce((a, b) -> a > b ? a : b);
		return max;
	}

	public static void main(String[] args) {
		Optional<Integer> mx = limit();
		if (mx.isPresent()) {
			System.out.println(limit().get());
		} else {
			System.out.println("Nothing present");
		}

		Optional<Integer> mx2 = skip();
		if (mx2.isPresent()) {
			System.out.println(skip().get());
		} else {
			System.out.println("Nothing present");
		}
	}
}
