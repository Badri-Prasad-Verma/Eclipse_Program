package app_java_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(30);
		System.out.println("Using add method = "+list);
		
		list.add(4, 60);
		System.out.println("Using add method(index,value) = "+list);
		
		list.remove(4);
		System.out.println(list);
		
		list.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		if(list.contains(40)) {
			System.out.println("40 is present");
		}else {
			System.out.println("40 is not present");
		}
		
		System.out.println("2nd index value is : "+list.get(2));
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
