package OverloadingConcept;

public class OverloadingMainMetodExample {

	public static void method(int x,int y) {
		System.out.println("1st main");
		System.out.println(x);
		System.out.println(y);
	}
	public static void method(int x,String str, double dout,float f) {
		System.out.println("2st main");
		System.out.println(x);
		System.out.println(str);
		System.out.println(dout);
		System.out.println(f);
	}
	public static void method(int x,String str,char ch, boolean bool) {
		System.out.println("3st main");
		System.out.println(x);
		System.out.println(str);
		System.out.println(ch);
		System.out.println(bool);
		}
	public static void main(String[] args) {
		OverloadingMainMetodExample.method(10, 10);
	}
}
