package app_java_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberPalindrome {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(123,654,756,878,465,343);
		List<Integer> list= palindromeNumber(asList);
		System.out.println(list);
	}

	private static List<Integer> palindromeNumber(List<Integer> asList) {
		List<Integer> palindrome=new ArrayList<>();
		for (Integer integer : asList) {
			if(isPolindrome(integer)) {
				palindrome.add(integer);
			}
		}
		return palindrome;
	}

	private static boolean isPolindrome(Integer integer) {
		String valueOf = String.valueOf(integer);
		String string = new StringBuilder(valueOf).reverse().toString();
		return string.equalsIgnoreCase(valueOf);
	}

}
