package app_java_functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
	
	public static void main(String[] args) {
		Function<Integer, Integer> fuction= x->x*x;
		System.out.println(fuction.apply(10));
		
		Function<Integer, Integer> fuctional= x->50-x;
		System.out.println(fuctional.apply(10));
		
		Function<Integer, Integer> fuctionional= x->20+x;
		System.out.println(fuctionional.apply(10));
		
		Function<Integer, Integer> fuction1= x->10/x;
		System.out.println(fuction1.apply(5));
		
		BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;
		System.out.println(concatenate.apply("Hello, ", "world!"));
		
	}

}
