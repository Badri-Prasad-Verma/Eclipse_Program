package app_java_String;

import java.util.HashMap;

public class FindNonRepeatableCharacter {
	public static void main(String[] args) {
		String str="badri prasad verma";
		HashMap<Character, Integer> map=new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println("No repeatable character : ");
		for (char ch1 : str.toCharArray()) {
			if(map.get(ch1)==1) {
				System.out.print(ch1+" ");
			}
		}
	}
}
