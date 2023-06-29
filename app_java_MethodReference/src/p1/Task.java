package p1;

public class Task {
	
	public Task() {
		System.out.println("this is a constructor");
	}

	public static void doTask() {
		System.out.println("This is my task");
	}
	
	public void method() {
	System.out.println("this is non static method");
	}
	
//	public static void printThread(){
//		for (int i = 1; i <=10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	public static void printNumber(){
//		for (int i = 1; i <=10; i++) {
//			System.out.println(i*2);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
}
