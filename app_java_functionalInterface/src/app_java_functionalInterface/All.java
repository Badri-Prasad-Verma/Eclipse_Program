package app_java_functionalInterface;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class All {
	public static void main(String[] args) {
		Predicate<Integer> pre=e->e.equals(20);
		System.out.println(pre.test(20));
		
		Function<Integer, Integer> fun=e->e*e+10;
		System.out.println(fun.apply(10));
		
		Consumer<Integer> con=e->System.out.println(e);
		con.accept(20);
		
		Supplier<Date> da=()->new Date();
		System.out.println(da.get());
		
		BiPredicate<Integer, Integer> bipre=(s1,s2)->s1.equals(s2);
		System.out.println(bipre.test(20, 20));
		
		BiFunction<String, String, String> b1=(s1,s2)->s1.concat(s2);
		System.out.println(b1.apply("badri", "prasad"));
		
		BiConsumer<String, String> b2=(s1,s2)->System.out.println(s1.concat(s2));
		b2.accept("badri", "verma");
	}
}
