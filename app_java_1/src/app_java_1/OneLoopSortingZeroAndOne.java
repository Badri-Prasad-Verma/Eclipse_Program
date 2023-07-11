package app_java_1;

import java.util.Scanner;

public class OneLoopSortingZeroAndOne {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		
		System.out.println("Enter "+n+" numbers");
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Original Zeroes and Ones");
		printArrays(arr);
		sortedZerowsAnsOne(arr);
		System.out.println("Sorted zeroes and Ones");
		printArrays(arr);
	}

	private static void sortedZerowsAnsOne(int[] arr) {
		int n=arr.length;
		int left=0;
		int right=n-1;
		while(left<right) {
			if(arr[left]==1 && arr[right]==0) {
				swap(arr,left,right);
				left++;
				right--;
			}
			if(arr[left]==0) {
				left++;
			}
			if(arr[right]==1) {
				right--;
			}
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	private static void printArrays(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


}
