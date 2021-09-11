package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex09Quantifier {
	public static void main(String[] args) {
		String p1 = "a{3}";						// a라는 글자가 3번 반복
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "aa"));
		System.out.println(Pattern.matches(p1, "aaa"));
		System.out.println(Pattern.matches(p1, "aaaa"));
		
		System.out.println("==============================");
		
		String p2 = "a{1,3}";					// a라는 글자가 1번~3번 까지 가능
		
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "aa"));
		System.out.println(Pattern.matches(p2, "aaa"));
		System.out.println(Pattern.matches(p2, "aaaa"));
		
		System.out.println("==============================");
		
		String p3 = "a{2,}";					// a가 두번 반복 이상으로 시작
		
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "aa"));
		System.out.println(Pattern.matches(p3, "aaa"));
		System.out.println(Pattern.matches(p3, "aaaa"));
		System.out.println(Pattern.matches(p3, "bbaa"));
		System.out.println(Pattern.matches(p3, "aabb"));
		
	}
}
