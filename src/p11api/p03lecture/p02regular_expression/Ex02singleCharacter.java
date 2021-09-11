package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex02singleCharacter {
	public static void main(String[] args) {
		String s1 = "\t";
		String p1 = "\t";
		
		System.out.println(s1);
		
		System.out.println(Pattern.matches(p1, s1));
		
		String s2 = "\n";
		String p2 = "\n";
		System.out.println(Pattern.matches(p2, s2));
		
		String s3 = "\\";
		String p3 = "\\\\";				// \쓰려면 \하나 더써야됨
		
		System.out.println(s3);
		System.out.println(Pattern.matches(p3, s3));
	}
}
