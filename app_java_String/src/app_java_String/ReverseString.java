package app_java_String;

public class ReverseString {

	public static void main(String[] args) {
		String str="badri";
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
