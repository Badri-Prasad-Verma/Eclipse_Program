package app_java_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableImplements {
	public static void main(String[] args) {
		List<ComparableExamples> compare=new ArrayList<>();
		compare.add(new ComparableExamples(3,"badri","bangalore","male"));
		compare.add(new ComparableExamples(5,"satish","mumbai","male"));
		compare.add(new ComparableExamples(4,"deepak","chennai","male"));
		compare.add(new ComparableExamples(6,"ram","hydrabaad","male"));
		Collections.sort(compare);
		System.out.println(compare);
		
	}

}
