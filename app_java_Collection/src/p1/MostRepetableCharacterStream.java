package p1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepetableCharacterStream {
	public static void main(String[] args) {
		
		String str="9076388280";
		Entry<Character, Long> orElse = str.chars().mapToObj(e->(char)e)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue())
		.orElse(null);
		
		if(orElse!=null) {
			System.out.println("Most Repeated Character : "+orElse.getKey());
			System.out.println("Count : "+orElse.getValue());
		}
	}
}
