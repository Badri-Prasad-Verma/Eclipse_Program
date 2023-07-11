package app_java_1;

public class D{
	
	public static void main(String[] args) {
		int[] arr1= {2,3,9,6,7};
		int[] arr2= {4,9,8,1};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
