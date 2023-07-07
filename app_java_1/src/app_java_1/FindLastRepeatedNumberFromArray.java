package app_java_1;

import java.util.HashSet;

public class FindLastRepeatedNumberFromArray {
	public static void main(String[] args) {
		 int arr[] = {1, 2, 3, 4, 5, 4, 6, 5};
	     int n = returnLastRepatedNumer(arr);
	     System.out.println("Last Repeated Number : "+n);
	}

	private static int returnLastRepatedNumer(int[] arr) {
		HashSet<Integer> set=new HashSet<>();
		int lastRepeated=-1;
		for (int i = arr.length-1;i>=0; i--) {
			int num=arr[i];
			if(set.contains(num)) {
				lastRepeated=num;
				break;
			}
			set.add(num);
		}
		return lastRepeated;
	}
}
