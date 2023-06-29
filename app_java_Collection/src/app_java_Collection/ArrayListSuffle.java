package app_java_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSuffle {
	 public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        System.out.println("Original ArrayList: " + numbers);

	        // Shuffle the ArrayList
	        Collections.shuffle(numbers);

	        System.out.println("Shuffled ArrayList: " + numbers);
	    }
}
