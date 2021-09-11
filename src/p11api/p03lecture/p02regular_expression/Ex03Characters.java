package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex03Characters {
	public static void main(String[] args) {
		String p1 = "[abc]"; 							// [abc] a거나b거나 c거나
		// a , b ,c 만 매치하면 좋겟다?

		System.out.println(Pattern.matches(p1, "a")); // true
		System.out.println(Pattern.matches(p1, "b")); // true
		System.out.println(Pattern.matches(p1, "c")); // true

		System.out.println(Pattern.matches(p1, "d")); // false
		System.out.println(Pattern.matches(p1, "e")); // false
		System.out.println(Pattern.matches(p1, "f")); // false
		
		System.out.println("======================================");
		
		String p2 = "[azAz]";
		
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "A"));
		System.out.println(Pattern.matches(p2, "z"));
		System.out.println(Pattern.matches(p2, "Z"));
		
		System.out.println(Pattern.matches(p2, "b"));
		System.out.println(Pattern.matches(p2, "C"));
		
		System.out.println("======================================");
		
		String p3 = "[abcdefghijklmnopqrstuvwxyz]";
		
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "b"));
		System.out.println(Pattern.matches(p3, "c"));
		
		System.out.println(Pattern.matches(p3, "A"));
		System.out.println(Pattern.matches(p3, "B"));
		System.out.println(Pattern.matches(p3, "ac"));
		
		
	}
}
