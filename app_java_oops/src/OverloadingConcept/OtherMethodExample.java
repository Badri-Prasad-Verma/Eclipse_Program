package OverloadingConcept;

public class OtherMethodExample {

	public  void method(int x,int y) {
		System.out.println("1st main");
		System.out.println(x);
		System.out.println(y);
	}
	public  void method(int x,String str, double dout) {
		System.out.println("2st main");
		System.out.println(x);
		System.out.println(str);
		System.out.println(dout);
	}
	public  void method(int x,char ch, boolean bool) {
		System.out.println("3st main");
		System.out.println(x);
		System.out.println(ch);
		System.out.println(bool);
		}
	public static void main(String[] args) {
		OtherMethodExample example=new OtherMethodExample();
		example.method(10, 20);
	}
}
