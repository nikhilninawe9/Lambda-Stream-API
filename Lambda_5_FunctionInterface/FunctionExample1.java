package Lambda_5_FunctionInterface;

import java.util.function.Function;

public class FunctionExample1 {

	static Function<String, String> upperCase = (name) -> name.toUpperCase();

	static Function<String, String> addSomething = (type) -> type.toUpperCase().concat(" uppercase has been done");

	public static void main(String[] args) {
		System.out.println(upperCase.apply("ansh"));
		System.out.println("__________________________________________________________________");
		System.out.println(addSomething.apply("qwerty"));
		System.out.println("__________________________________________________________________");
		System.out.println(upperCase.andThen(addSomething).apply("dddddd23"));
		System.out.println("__________________________________________________________________");
		System.out.println(upperCase.compose(addSomething)
				.apply("dddddd23"));/*
									 * by compose=> addSomething will execute first then the result will be added in
									 * upperCase as an argument. this is called chaining
									 */
	}
}
