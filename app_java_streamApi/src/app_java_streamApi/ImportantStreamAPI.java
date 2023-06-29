package app_java_streamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ImportantStreamAPI {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "durian", "elderberry");
		List<String> sortedStrings = strings.stream()
		                                   .sorted(Comparator.comparingInt(String::length))
		                                   .collect(Collectors.toList());
		System.out.println(sortedStrings);
		
		List<String> flatMap = strings.stream().flatMap(str->Arrays.stream(str.split("")))
				.collect(Collectors.toList());
		System.out.println(flatMap);
		
		List<List<Integer>> nestedLists = Arrays.asList(
		        Arrays.asList(1, 2, 3),
		        Arrays.asList(4, 5, 6),
		        Arrays.asList(7, 8, 9)
		);

		List<Integer> flattenedList = nestedLists.stream()
		                                         .flatMap(Collection::stream)
		                                         .collect(Collectors.toList());
		System.out.println(flattenedList);
	}
}
