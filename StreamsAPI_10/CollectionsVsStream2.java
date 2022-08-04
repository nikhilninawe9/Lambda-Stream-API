package StreamsAPI_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStream2 {
	public static void main(String[] args) {
		/* 1. We can add remove and modify in collection */
		List<String> list = new ArrayList<>();
		list.add("Adam");
		list.add("Steve");
		list.add("Bella");
		list.add("Cao");

		// list.remove(0);
		System.out.println(list);

		/* 1. We can not add remove and modify in streams */

		/*
		 * 2. Collection we can iterate n number of times but stream we can use once
		 */

		for (String s : list) {
			System.out.println(s.length());
		}

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("---------------------------------------------------------");
		Stream<String> names1 = list.stream();
		names1.forEach(n -> System.out.println(n));
		System.out.println("---------------------------------------------------------");
		names1.forEach(q -> System.out.println(q.length()));
	}
}
