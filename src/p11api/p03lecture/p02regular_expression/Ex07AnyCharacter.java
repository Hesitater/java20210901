package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex07AnyCharacter {
	public static void main(String[] args) {
		String p1 = ".";			// . 은  모든 한글자 가능
		
		System.out.println(Pattern.matches(p1, " "));
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "Z"));
		System.out.println(Pattern.matches(p1, "0"));
		System.out.println(Pattern.matches(p1, "한"));
		System.out.println(Pattern.matches(p1, "."));
		
		System.out.println("===================================");
		
		String p2 = "\\.";				// . 자체를 판단하고 싶으면 /\. 을 쓰면된다
		
		System.out.println(Pattern.matches(p2, " "));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "Z"));
		System.out.println(Pattern.matches(p2, "0"));
		System.out.println(Pattern.matches(p2, "한"));
		System.out.println(Pattern.matches(p2, "."));
		
		System.out.println("================================");
		String p3 = "[a-z^C]";
		
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "A"));
		System.out.println(Pattern.matches(p3, "^"));
		System.out.println(Pattern.matches(p3, "C"));
	}
}
