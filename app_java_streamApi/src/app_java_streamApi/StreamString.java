package app_java_streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamString {
	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("badri","satish","ram",
				"apple","mango","banana");
		
		List<String> collect = asList.stream().sorted()
				.collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = asList.stream().filter(e->e.equals("badri")).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<String> collect3 = asList.stream().sorted().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect3);
		
		List<String> collect4 = asList.stream().filter(e->e.startsWith("b")).collect(Collectors.toList());
		System.out.println(collect4);
		
		asList.stream().filter(e->e.contains("satish")).collect(Collectors.toList())
		.forEach(System.out :: println);
		
		List<String> collect5 = asList.stream().map(e->e.replaceFirst("badri", "verma"))
		.collect(Collectors.toList());
		System.out.println(collect5);
		
	}

}
