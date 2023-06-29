package app_java_String;

import java.util.HashMap;
import java.util.Map;

public class CountString {
	public static void main(String[] args) {
		String str="this is a mango and is a fruits";
		Map<String, Integer> map=new HashMap<>();
		String[] split = str.split(" ");
		for (String string : split) {
			if(map.containsKey(string)) {
				map.put(string, map.getOrDefault(string, 0)+1);
			}else {
				map.put(string, 1);
			}
		}
		System.out.println(map);
	}
}
