package p1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacterStream {

	public static void main(String[] args) {
		String str="Badri Prasad Verma";
		
		str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1)
		.map(Map.Entry::getKey).forEach(e->System.out.print(e+" "));
		
	}
}
