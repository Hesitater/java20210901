package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex10Quantifier {
	public static void main(String[] args) {
		String p1 = "a{1,}";				//a로 시작 한개이상
		String p2 = "a+";					// +: 1개이상
		
		System.out.println(Pattern.matches(p1, ""));
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "aa"));
		
		System.out.println(Pattern.matches(p2, ""));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "aa"));
		
		System.out.println("==============================");
		
		String p3 = "a{0,}"; 			// a 0개이상
		String p4 = "a*"; 				// * : 0개이상
		
		System.out.println(Pattern.matches(p3, ""));
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "aa"));
		
		System.out.println(Pattern.matches(p4, ""));
		System.out.println(Pattern.matches(p4, "a"));
		System.out.println(Pattern.matches(p4, "aa"));
		
		System.out.println(Pattern.matches(p4, "ab"));
		
		System.out.println("==============================");
		
		
		String p5 = "[a-zA-z]\\d*";      //영문자로시작해서 숫자가 0개이상 있으면 됨
		
		System.out.println(Pattern.matches(p5, "c"));
		System.out.println(Pattern.matches(p5, "z0"));
		System.out.println(Pattern.matches(p5, "k1"));
		System.out.println(Pattern.matches(p5, "k1234"));
		System.out.println(Pattern.matches(p5, "cc12"));
		
		System.out.println("-------------------");
		
		String p6 = "[a-zA-Z&&[^C-D]]";			//&& || 확인
		System.out.println(Pattern.matches(p6, "A"));
		System.out.println(Pattern.matches(p6, "B"));
		System.out.println(Pattern.matches(p6, "C"));
		System.out.println(Pattern.matches(p6, "D"));
		System.out.println(Pattern.matches(p6, "E"));
		System.out.println(Pattern.matches(p6, "a"));
		System.out.println(Pattern.matches(p6, "-"));
	}
}
