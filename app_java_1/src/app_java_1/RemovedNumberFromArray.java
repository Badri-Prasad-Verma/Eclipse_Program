package app_java_1;

import java.util.Arrays;
import java.util.Scanner;

public class RemovedNumberFromArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		System.out.println("Enter "+n+" numbers");
		
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter remove number");
		int element=scan.nextInt();
		
		System.out.println("Original Array"+Arrays.toString(arr));
		
		int[] remove = removeArray(arr,element);
		System.out.println("Removed Array"+Arrays.toString(remove));
		
	}

	private static int[] removeArray(int[] arr, int element) {
		int index=0;
		int[] newArray=new int[arr.length-1];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=element) {
				newArray[index]=arr[i];
				index++;
			}
		}
		return newArray;
	}

}
