package app_java_1;

public class ArrayReversed {
	public static int[] reversedArray(int[] arr) {
		int n=arr.length;
		int[] ans=new int[n];
		int j=0;
		for (int i = n-1; i >=0; i--) {
			ans[j++]=arr[i];
		}
		return ans;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] reverse=reversedArray(arr);
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]+" ");
		}
		
	}
}
