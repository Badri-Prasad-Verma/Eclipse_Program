package app_java_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintPalindrome {
	public static void main(String[] args) {
		String str="I know malayalam";
		String[] split = str.split(" ");
		List<String> list= findPolindrome(split);
		System.out.println(list);
	}

	private static List<String> findPolindrome(String[] split) {
		List<String> palindrome=new ArrayList<>();
		for (String string : split) {
			if(isPolindrome(string)) {
				palindrome.add(string);
			}
		}
		return palindrome;
	}

	private static boolean isPolindrome(String string) {
		String string2 = new StringBuilder(string).reverse().toString();
		return string.equalsIgnoreCase(string2);
	}
}
