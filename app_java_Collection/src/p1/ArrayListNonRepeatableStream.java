package p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListNonRepeatableStream {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("9076388280");
		HashMap<Character, Integer> hmap=new HashMap<>();
		asList.forEach(str->str.chars().mapToObj(c->(char)c)
			.forEach(e->hmap.merge(e, 1, Integer::sum)));
		
		hmap.entrySet().stream().filter(entry->entry.getValue()==1)
		.map(Map.Entry::getKey).forEach(e->System.out.println(e));;
	}
}
