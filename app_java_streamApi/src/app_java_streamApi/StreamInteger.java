package app_java_streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInteger {
		
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(15,3,90,78,84,63,93,55,72,43);
		List<Integer> collect = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = asList.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("Even Number =" + collect2);
		
		List<Integer> collect3 = asList.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println("Odd Number =" +collect3);
		
		List<Integer> collect4 = asList.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(collect4);
		
		Integer reduce = asList.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		
		
	}
}
