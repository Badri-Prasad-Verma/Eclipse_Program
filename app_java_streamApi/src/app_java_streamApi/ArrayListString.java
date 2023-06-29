package app_java_streamApi;

import java.util.Arrays;
import java.util.List;

public class ArrayListString {

	public static void main(String[] args) {
		List<String> asList1 = Arrays.asList("JAVA","HIBERNATE","MySQL");
		List<String> asList2 = Arrays.asList("Java","Hibernate","Spring");
		
		for (String string : asList1) {
			for (String string2 : asList2) {
				if(string.equalsIgnoreCase(string2)) {
					System.out.println(string);
				}
			}
		}
	}
}
