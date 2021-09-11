package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex06Predefined {
	public static void main(String[] args) {
		String p1 = "[0-9]";								// p1=p2 같은표현
		
		System.out.println(Pattern.matches(p1, "0"));
		System.out.println(Pattern.matches(p1, "9"));
		
		System.out.println("============================");
		
		String p2 = "\\d";				// \를 표현하려면 \한번 더써야됨 \d
		
		System.out.println(Pattern.matches(p2, "0"));
		System.out.println(Pattern.matches(p2, "9"));
		
		System.out.println("============================");
		String p3 = "[^0-9]";
		
		System.out.println(Pattern.matches(p3, "0"));
		System.out.println(Pattern.matches(p3, "9"));
		
		System.out.println("============================");
		String p4 = "\\D";									// p3=p4 같은표현
		
		System.out.println(Pattern.matches(p4, "0"));
		System.out.println(Pattern.matches(p4, "9"));
		
		System.out.println("============================");
		String p5 ="[a-zA-Z0-9_]";		//p5= p6 같은표현
		String p6 = "\\w";				//word character의 약자
		
		System.out.println(Pattern.matches(p5, "a"));
		System.out.println(Pattern.matches(p5, "A"));
		System.out.println(Pattern.matches(p5, "5"));
		System.out.println(Pattern.matches(p5, "_"));
		
		System.out.println(Pattern.matches(p6, "a"));
		System.out.println(Pattern.matches(p6, "A"));
		System.out.println(Pattern.matches(p6, "5"));
		System.out.println(Pattern.matches(p6, "_"));

		
		
		
	}
}
