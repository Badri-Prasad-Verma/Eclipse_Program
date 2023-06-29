package app_java_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindListPolindrome {
public static void main(String[] args) {
	List<String> asList = Arrays.asList("level","world","malayalam","mango","madam");
	List<String> list= findPalindrome(asList);
	System.out.println(list);
}

private static List<String> findPalindrome(List<String> asList) {
	List<String> isPalin=new ArrayList<>();
	for (String string : asList) {
		if(!isPalindrome(string)) {
			isPalin.add(string);
		}
	}
	return isPalin;
}

private static boolean isPalindrome(String string) {
	String string2 = new StringBuffer(string).reverse().toString();
	return string2.equalsIgnoreCase(string);
}
}
