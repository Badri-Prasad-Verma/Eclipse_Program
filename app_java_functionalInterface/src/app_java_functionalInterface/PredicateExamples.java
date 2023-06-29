package app_java_functionalInterface;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExamples {
	
	public static void main(String[] args) {
		Predicate<Integer> predicate=s->s%2==0;
		System.out.println(predicate.test(5));
		
		Predicate<String> predicated=s->s.length()<5;
		System.out.println(predicated.test("badri verma"));
		
		Predicate<String> predicates=s->s.length()>=5;
		System.out.println(predicates.test("badri verma"));
		
		System.out.println(predicates.negate().test("badri verma"));
		
		BiPredicate<String, String> equals=(s1,s2)->s1.equals(s2);
		System.out.println(equals.test("hello", "hello"));
		
		BiPredicate<Integer, Integer> bi=(s1,s2)->s1.equals(s2);
		System.out.println(bi.test(10, 10));
	
	}
}
