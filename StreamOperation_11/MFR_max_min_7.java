package StreamOperation_11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*If not using optional then it will show 0 as max or min value even if we dont pass any value as an inputs*/
public class MFR_max_min_7 {

	public static Optional<Integer> findMaxValue2() {
		List<Integer> integersList = Arrays.asList(21, 3, 44, 5, 12, 6, 77);
		Optional<Integer> max = integersList.stream().reduce((a, b) -> a > b ? a : b);
		return max;
	}

	public static int findMaxValue1() {
		List<Integer> integersList = Arrays.asList(21, 3, 44, 5, 12, 6, 77);
		int max = integersList.stream().reduce(0, (a, b) -> a > b ? a : b);
		return max;
	}

	public static int findMinValue1() {
		List<Integer> integersList = Arrays.asList(21, 3, 44, 5, 12, 6, 77);
		int min = integersList.stream().reduce(0, (a, b) -> a < b ? a : b);
		return min;
	}

	public static Optional<Integer> findMinValue2() {
		List<Integer> integersList = Arrays.asList(21, 3, 44, 5, 12, 6, 77);
		Optional<Integer> min = integersList.stream().reduce((a, b) -> a < b ? a : b);
		return min;
	}

	public static void main(String[] args) {
		int maxValue = findMaxValue1();
		System.out.println(maxValue);
		Optional<Integer> maxValueOptional = findMaxValue2();
		if (maxValueOptional.isPresent()) {
			System.out.println("Max value is " + maxValueOptional.get());
		} else {
			System.out.println("No max value found");
		}

	}
}
