package app_java_1;

import java.util.Scanner;

public class FindRepeatedNumberFromArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=scan.nextInt();
		System.out.println("Enter "+n+ " numbers");
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Repeated Number is : "+findRepeated(arr));
	}

	private static int findRepeated(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					return arr[j];
				}
			}
		}
		return -1;
	}
}
