package Optional_16;

import java.util.Optional;

public class OptionalPresentExample_4 {
	public static void main(String[] args) {

		Optional<String> stringOptional = Optional.ofNullable("Hello Optional");

		System.out.println(stringOptional.isPresent());

		stringOptional.ifPresent((s -> System.out.println("value is : " + s)));
	}
}