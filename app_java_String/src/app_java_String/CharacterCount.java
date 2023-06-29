package app_java_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterCount {
public static void main(String[] args) {
	String str="Hello World";
	Map<Character, Integer> map=new HashMap<>();
	
	for (char string : str.toCharArray()) {
		if(Character.isLetter(string)) {
			string=Character.toLowerCase(string);
			map.put(string, map.getOrDefault(string, 0)+1);
		}
	}
	
	for (Entry<Character, Integer> string1 : map.entrySet()) {
		System.out.println(string1);
	}
}
}
