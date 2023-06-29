package app_java_streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplcateElement {
	
	public static void main(String[] args) {
	List<Integer> asList = Arrays.asList(12,42,12,56,33,86,45,65,56,33);
	Set<Integer> set=new HashSet<>();
	asList.stream().filter(e->!set.add(e)).collect(Collectors.toSet())
	.forEach(e->System.out.println(e));
	
	}
}
