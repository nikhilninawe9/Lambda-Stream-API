package Lambdas_8_MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample1 {
	static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
	static Function<String, String> toUpperMethodReference = String::toUpperCase;

	public static void main(String[] args) {
		System.out.println(toUpperCaseLambda.apply("I am the game"));
		System.out.println(toUpperMethodReference.apply("qwerty"));
	}
}
