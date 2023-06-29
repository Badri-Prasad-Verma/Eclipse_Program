package app_java_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorImplements {

	public static void main(String[] args) {
		List<ComparatorExample> compare=new ArrayList<>();
		compare.add(new ComparatorExample(3,"badri","bangalore","male"));
		compare.add(new ComparatorExample(5,"satish","mumbai","male"));
		compare.add(new ComparatorExample(4,"deepak","chennai","male"));
		compare.add(new ComparatorExample(6,"ram","hydrabaad","male"));
		System.out.println(compare);

		SortByName by=new SortByName();
		Collections.sort(compare,by);
		System.out.println(compare);
		
		Collections.sort(compare,new SortByCity());
		System.out.println(compare);
		
		Collections.sort(compare,new SortById());
		System.out.println(compare);

	}
}
