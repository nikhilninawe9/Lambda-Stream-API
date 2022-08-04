package NumericStreams_13;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggrigateExample_3 {

	public static void main(String[] args) {
		System.out.println("Sum value is " + IntStream.rangeClosed(1, 50).sum());
		OptionalInt o = IntStream.rangeClosed(1, 50).max();
		System.out.println("Max value is " + o.getAsInt());

		OptionalLong l1 = LongStream.rangeClosed(10, 40).min();
		System.out.println("Max Long value is " + l1.getAsLong());

		OptionalDouble avg = IntStream.rangeClosed(1, 50).average();
		System.out.println("Average is " + avg.getAsDouble());
	}
}
