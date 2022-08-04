package Lambdas_3_Predicate;

import java.util.function.Predicate;

public class PredicateBasicExample1 {
	static Predicate<Integer> checkEven = (num) -> num % 2 == 0;
	static Predicate<Integer> checkOdd = (num) -> num % 2 != 0;
	static Predicate<Integer> ifDivisibleBy5 = (num) -> num % 5 == 0;

	public static void check() {
		Predicate<Integer> p = (num) -> {
			return num % 2 == 0;
		};
		System.out.println(p.test(5));
	}

	public static void predicateAnd() {
		System.out.println(checkEven.test(10));
		System.out.println(ifDivisibleBy5.and(checkOdd).test(13));
	}

	public static void predicateOr() {
		System.out.println(checkEven.test(12));
		System.out.println(ifDivisibleBy5.or(checkEven).test(12));
	}

	public static void predicateOrNegate() {
		System.out.println(checkEven.negate().test(12));
		System.out.println(ifDivisibleBy5.or(checkEven).negate().test(12));
	}

	public static void main(String[] args) {
		check();
		System.out.println("888888888888888888888888888888888888888888888888888888888888");
		predicateAnd();
		System.out.println("888888888888888888888888888888888888888888888888888888888888");
		predicateOr();
		System.out.println("888888888888888888888888888888888888888888888888888888888888");
		predicateOrNegate();
	}
}
