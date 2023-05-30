package com.collections;

import java.util.List;
import java.util.stream.Stream;

// Stream in Java is a sequence of data

public class StreamExample {

	public static void main(String[] args) {

		Stream<String> empty = Stream.empty();
		System.out.println(empty);

		Stream<Integer> of = Stream.of(1);
		System.out.println(of);

		Stream<Integer> fromArray = Stream.of(1, 2, 3);
		System.out.println(fromArray);

		// converting a collection to a stream
		var list = List.of("a", "b", "c");
		Stream<String> fromList = list.stream();

		// Creating a parallel stream
		var listp = List.of("a", "b", "c");
		Stream<String> fromListParallel = listp.parallelStream();

		// Creating infinite streams : You can't create an infinite streams.
		Stream<Double> randoms = Stream.generate(Math::random);
		System.out.println(randoms);

		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		System.out.println(oddNumbers);
	}
}
