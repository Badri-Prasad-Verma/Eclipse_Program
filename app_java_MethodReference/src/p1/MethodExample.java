package p1;

public class MethodExample {
	public static void main(String[] args) {
		System.out.println("Method Reference Example");
		
		FunctionalInter function=Task::doTask;
		function.methodRef();
		
		FunctionalInter functionalInter =Task::new;
		functionalInter.methodRef();
		
		Task task=new Task();
		FunctionalInter inter=task::method;
		inter.methodRef();
		
//		FunctionalInter inter=Task::doTask;
//		inter.methodRef();
//		Runnable runnable=Task::printNumber;
//		Thread th=new Thread(runnable);
//		th.start();
//		
//		Runnable runnable1=Task::printThread;
//		Thread th1=new Thread(runnable1);
//		th1.start();
		
	}
}
