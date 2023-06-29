package app_java_functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer<String> consumer=s->System.out.println(s);
		consumer.accept("Badri");
		
		Consumer<Integer> consume=s->System.out.println(s*s);
		consume.accept(5);
		
		BiConsumer<Integer, Integer> bicon=(s1,s2)->System.out.println(s1*s2);
		bicon.accept(10, 20);
	}
}
