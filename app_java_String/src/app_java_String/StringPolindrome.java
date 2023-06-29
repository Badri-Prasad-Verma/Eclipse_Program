package app_java_String;

public class StringPolindrome {

	public static void main(String[] args) {
		String str="racecar";
		boolean bool=stringPlin(str);
		System.out.println(str);
		System.out.println(bool);
	}

	private static boolean stringPlin(String str) {
			String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }
	        return str.equalsIgnoreCase(reversed);
	}
}
