package app_java_singleton;

public class A {
	
	public static void main(String[] args) {
		Singleton singleton=Singleton.getIntance();
		System.out.println(singleton);
		
		Singleton singleton2=Singleton.getIntance();
		System.out.println(singleton2);
		
		Singleton singleton3=Singleton.getIntance();
		System.out.println(singleton3);
	}

}
