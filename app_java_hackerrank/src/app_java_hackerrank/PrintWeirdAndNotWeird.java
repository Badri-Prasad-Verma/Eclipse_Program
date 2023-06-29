package app_java_hackerrank;

import java.util.Scanner;

public class PrintWeirdAndNotWeird {
//	Given an integer, , perform the following conditional actions:
//		If  is odd, print Weird
//		If  is even and in the inclusive range of  to , print Not Weird
//		If  is even and in the inclusive range of  to , print Weird
//		If  is even and greater than , print Not Weird
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int n = scan.nextInt();
		scan.close();

        String result = "";

        if (n % 2 != 0) {
            result = "Weird";
        } else {
            if (n >= 2 && n <= 5) {
                result = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                result = "Weird";
            } else {
                result = "Not Weird";
            }
        }

        System.out.println(result);
    }
}
