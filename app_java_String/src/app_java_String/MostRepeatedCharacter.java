package app_java_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedCharacter {
	public static void main(String[] args) {
		String str="badriprasadverma";
		Entry<Character, Long> max = str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).entrySet().stream()
		.max(Map.Entry.comparingByValue()).orElse(null);
		
		if(max!=null) {
			System.out.println("Most repated character is : "+max.getKey());
			System.out.println("Count character is : "+max.getValue());
		}
	}
}
