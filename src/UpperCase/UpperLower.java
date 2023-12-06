package UpperCase;

public class UpperLower {

	public static void main(String[] args) {
		String any = caps("i love java and java loves me");
		System.out.println(any);

	}
	public static String caps(String s ) {
		return s.toUpperCase();
	}

}
