package app_java_1;

import java.util.Scanner;

public class FindUniqueOfGivenArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size");
		
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+ n+" number array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Unique Number is : "+findUnique(arr));
		
		
	}

	private static int findUnique(int[] arr) {
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		
		int ans=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				ans=arr[i];
			}
		}
		return ans;
	}
}
