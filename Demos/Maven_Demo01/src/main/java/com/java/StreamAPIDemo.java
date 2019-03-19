package com.java;

import java.util.*;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 5, 6);

		list.stream().filter(x -> x % 2 == 0).map(x -> x * 2).forEach(x -> System.out.println(x));
		System.out.println();

		List<String> list2 = Arrays.asList("apple", "orange", "peach", "guava", "kiwi", "grapes");

		list2.stream().filter(s -> s.toLowerCase().contains("e"))
				.mapToInt(s -> (int) s.chars().filter(c -> c == 'e').count()).forEach(n -> System.out.println(n));

		list2.stream().filter(s -> s.toLowerCase().contains("e"))
				.forEach(s -> System.out.printf("\nThe length of \"%s\" is %d", s, s.length()));

		String str = "apples";
		System.out.printf("\n\nCharacters w/ an even ASCII value in \"%s\": ", str);
		str.chars().filter(c -> c % 2 == 0).forEach(c -> System.out.print(Character.toString((char) c)));

		System.out.println("\n");
		Stream.iterate(1, x -> x + 1).limit(100).filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
		;

	}

}
