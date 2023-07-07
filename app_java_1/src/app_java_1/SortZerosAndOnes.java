package app_java_1;

import java.util.Scanner;

public class SortZerosAndOnes {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		
		System.out.println("Enter "+n+" numbers");
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Original Array : ");
		printArray(arr);
		sortArray(arr);
		System.out.println("Sorted Array : ");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void sortArray(int[] arr) {
		int n=arr.length;
		int count=0;
		for (int i = 0; i < n; i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if(i<count) {
				arr[i]=0;
			}else {
				arr[i]=1;
			}
		}
		
	}
}
