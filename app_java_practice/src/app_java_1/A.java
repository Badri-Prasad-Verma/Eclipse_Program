package app_java_1;

import java.util.Arrays;
import java.util.Scanner;

public  class A {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" numbers");
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter romoval number");
		int number=scan.nextInt();
		System.out.println("Original array is : "+Arrays.toString(arr));
		System.out.println("Array after removing number : "+
								Arrays.toString(removeNumber(arr,number)));
	}

	private static int[] removeNumber(int[] arr, int number) {
		int index=0;
		int[] newArray=new int[arr.length-1];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=number) {
				newArray[index]=arr[i];
				index++;
			}
		}
		return newArray;
	}

}









