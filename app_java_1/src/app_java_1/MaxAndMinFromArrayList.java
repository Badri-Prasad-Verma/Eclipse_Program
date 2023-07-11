package app_java_1;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinFromArrayList {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(12,65,95,23,87,34,93,27);
		int min=asList.get(0);
		int max=asList.get(0);
		
		for (int i = 0; i < asList.size(); i++) {
			int num=asList.get(i);
			if(num<min) {
				min=num;
			}
			if(num>max) {
				max=num;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
