package app_java_1;

import java.util.HashSet;

public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,7,8,9,0};
		findMissingNumber(arr);
	}

	private static void findMissingNumber(int arr[]) {
		HashSet<Integer> hash=new HashSet<>();
		for (Integer num : arr) {
			hash.add(num);
		}
		int n=arr.length+1;
		for (int i = 0; i < n; i++) {
			if(!hash.contains(i)) {
				System.out.println(i);
			}
			
		}
		
	}
}
