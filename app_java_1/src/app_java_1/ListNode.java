package app_java_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class ListNode {
	
	public static void main(String[] args) {
		 int[][] arr1 = {{1, 2}, {3, 4}, {5, 6}};
		 int totalElements = 0;
		 for (int i = 0; i < arr1.length; i++) {
	            totalElements =totalElements+ arr1[i].length;
	        }

	        int[] combinedArray = new int[totalElements];
	        int index = 0;
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr1[i].length; j++) {
	                combinedArray[index] = arr1[i][j];
	                index++;
	            }
	        }
	        for (int i = 0; i < combinedArray.length; i++) {
	            System.out.print(combinedArray[i] + " ");
	        }
	}
}
