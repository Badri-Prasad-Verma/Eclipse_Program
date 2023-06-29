package app_java_String;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {
	public static void main(String[] args) {
		String str="9076388280";
		System.out.println("Original String : "+str);
		String mostRepeat=findMostRepeat(str);
		System.out.println("Most Repeated character : "+mostRepeat);
	}

	private static String findMostRepeat(String str) {
		HashMap<Character, Integer> map=new HashMap<>();
		int maxCount=0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			int count = map.getOrDefault(charAt, 0)+1;
			map.put(charAt, count);
			if(count>maxCount) {
				maxCount=count;
			}
		}
		StringBuilder builder=new StringBuilder();
		for (Map.Entry<Character, Integer> element : map.entrySet()) {
			if(element.getValue()==maxCount) {
				builder.append(element.getKey());
			}
		}
		
		return builder.toString();
	}
}
