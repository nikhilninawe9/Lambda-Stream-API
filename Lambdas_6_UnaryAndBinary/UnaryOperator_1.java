package Lambdas_6_UnaryAndBinary;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperator_1 {
	/*
	 * Unary Operator [where the input and output are of the same type Instead of
	 * function use unary operator] It takes 1 input and 1 output of same type
	 */

	/* Binary Operator [It takes 2 input and 1 output of same type] */

	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
	static UnaryOperator<String> uoper = (str) -> str.toUpperCase();

	static BinaryOperator<Integer> biop = (num1, num2) -> num1 * num2;

	static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
	static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

	public static void main(String[] args) {
		System.out.println(uoper.apply("asdas"));
		System.out.println(biop.apply(12, 2));
		System.out.println(maxBy.apply(44, 32));// 44
		System.out.println(minBy.apply(12, 11));// 11
	}

}
