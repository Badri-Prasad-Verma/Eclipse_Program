package app_java_1;

import java.util.Scanner;

public class ArrayPairs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = scan.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter "+ n +" elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter target number");
		int target = scan.nextInt();
		System.out.println("The Pairs of number is : "+sumPairs(arr,target));
	}

	private static int sumPairs(int[] arr, int target) {
		int n = arr.length;
		int ans=0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i]+arr[j]==target) {
					ans++;
				}
			}
		}
		
		return ans;
	}
}
