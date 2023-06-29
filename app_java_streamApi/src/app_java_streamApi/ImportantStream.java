package app_java_streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImportantStream {

	public static void main(String[] args) {
	
		String str1="badri";
		List<Character> collect = str1.chars().mapToObj(x->(char)x).collect(Collectors.toList());
		System.out.println(collect);
		
		  List<String> asList = Arrays.asList("sahil");
		  List<String> flatMap = asList.stream()
				  .flatMap(str ->Arrays.stream(str.split("")))
				  .collect(Collectors.toList());
		  System.out.println(flatMap);
		  
		  
		  
		  
	}
}
