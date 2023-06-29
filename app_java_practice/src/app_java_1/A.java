package app_java_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class A {
	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int queries = scanner.nextInt();

	        for (int i = 0; i < queries; i++) {
	            int a = scanner.nextInt();
	            int b = scanner.nextInt();
	            int n = scanner.nextInt();

	            // Print the series for the current query
	            printSeries(a, b, n);
	        }

	        scanner.close();
	    }

	    private static void printSeries(int a, int b, int n) {
	        int term = a;
	        for (int i = 0; i < n; i++) {
	            term += (int) (Math.pow(2, i) * b);
	            System.out.print(term + " ");
	        }
	        System.out.println();
	}
}








