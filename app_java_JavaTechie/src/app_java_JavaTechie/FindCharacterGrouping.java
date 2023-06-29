package app_java_JavaTechie;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharacterGrouping {
	public static void main(String[] args) {
		String str="badri prasad verma";
		Map<String, Long> collect = Arrays.stream(str.split(""))
		.filter(a->a!="a").collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		System.out.println(collect);
	}
}
