package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex04Characters {
	public static void main(String[] args) {
		String p1 = "[abcd]";
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "b"));
		System.out.println(Pattern.matches(p1, "c"));
		System.out.println(Pattern.matches(p1, "d"));
		
		System.out.println("================================");
		
		String p2 = "[a-d]";		//a부터 d까지 의미에서 [a-d] 사용
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "b"));
		System.out.println(Pattern.matches(p1, "c"));
		System.out.println(Pattern.matches(p1, "d"));
		
		System.out.println("================================");
		
		String p3 = "[0-9]";
		
		System.out.println(Pattern.matches(p3, "0"));
		System.out.println(Pattern.matches(p3, "1"));
		System.out.println(Pattern.matches(p3, "9"));
		
		System.out.println("================================");
		String p4 = "[A-Z]";
		
		System.out.println(Pattern.matches(p4, "A"));
		System.out.println(Pattern.matches(p4, "B"));
		System.out.println(Pattern.matches(p4, "C"));
		
		System.out.println("================================");
		String p5 = "[a-zA-Z]";
		
		System.out.println(Pattern.matches(p5, "A"));
		System.out.println(Pattern.matches(p5, "B"));
		System.out.println(Pattern.matches(p5, "C"));
		
		System.out.println(Pattern.matches(p5, "a"));
		System.out.println(Pattern.matches(p5, "b"));
		System.out.println(Pattern.matches(p5, "c"));
		
		
	}
}
