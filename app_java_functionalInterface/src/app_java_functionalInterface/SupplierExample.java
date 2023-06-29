package app_java_functionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		
		Supplier<Integer> randomNumberGenerator = () -> (int) (Math.random() * 100);
		int randomValue = randomNumberGenerator.get();
		System.out.println(randomValue);
		
		Supplier<Date> supplier=()-> new Date(); 
		System.out.println(supplier.get());
		
	}
}
