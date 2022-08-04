package StreamFactoryMethods_12;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateEx_1 {
	public static void main(String[] args) {
		/* of method */
		Stream<String> stream = Stream.of("ansh", "nikhil", "rohini");
		stream.forEach(System.out::println);

		/* iterate method */
		Stream.iterate(1, x -> x * 2).limit(5).forEach(a -> System.out.println(a));

		/* generate method */
		Supplier<Integer> integerSupplier = new Random()::nextInt;
		Stream.generate(integerSupplier).limit(5).forEach(System.out::println);
	}
}
