package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex08Series {
	public static void main(String[] args) {
		String p1 = "java";
		
		System.out.println(Pattern.matches(p1, "java")); 
		System.out.println("=================================");
		
		
		String p2 = "a[0-9]";		//총글자는 2개여야하고 첫번째글자는 a여야하며두번쨰는 0~9
		
		System.out.println(Pattern.matches(p2, "a0"));
		System.out.println(Pattern.matches(p2, "a9"));
		System.out.println(Pattern.matches(p2, "a")); 			// 한글자도 안되고
		System.out.println(Pattern.matches(p2, "a33"));			// 3글자도 안되고
		
		System.out.println("=================================");
		
		String p3 = "[a-zA-Z]\\w\\w";		//3글자 영대소문자,word캐릭터,word캐릭터
		
		System.out.println(Pattern.matches(p3, "a93"));
		System.out.println(Pattern.matches(p3, "z_A"));
		
		
		
	}
}
