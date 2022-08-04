package Lambdas_1_Interfaces;

import java.util.Comparator;

public class Comparator_2 {
	public static void main(String[] args) {
		/* Java simple way */
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println(comparator.compare(1, 1));

		/* Lambda */
		Comparator<Integer> comp = (o1, o2) -> {
			return o1.compareTo(o2);
		};
		System.out.println(comp.compare(212, 1));
	}
}
