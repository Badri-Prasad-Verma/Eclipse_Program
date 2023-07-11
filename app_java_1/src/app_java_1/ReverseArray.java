package app_java_1;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		
		System.out.println("Enter "+n+" numbers");
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Original Arrays : ");
		printArray(arr);
		sortingArray(arr);
		System.out.println("Sorting Arrays : ");
		printArray(arr);
		
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

	private static void sortingArray(int[] arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			swapArrap(arr,i,j);
			i++;
			j--;
		}
	}

	private static void swapArrap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
