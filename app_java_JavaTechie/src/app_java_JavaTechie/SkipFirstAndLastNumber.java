package app_java_JavaTechie;

import java.util.stream.IntStream;

public class SkipFirstAndLastNumber {
	public static void main(String[] args) {
		IntStream.range(1, 10).skip(1)
		.limit(8).forEach(e->System.out.println(e));
		
	}
}
