package p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListRepeatable {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("BadriPrasadVerma");
		HashMap<Character, Integer> hmap=new HashMap<>();
		asList.forEach(str->str.chars().mapToObj(e->(char)e)
				.forEach(c->hmap.merge(c, 1, Integer::sum)));
		
		hmap.entrySet().stream().filter(s->s.getValue()>1)
		.map(Map.Entry::getKey).forEach(e->System.out.println(e));
	}
}
