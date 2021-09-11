package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex01singleCharacter {
	public static void main(String[] args) {
		String s1 = "a"; //string
		String p1 = "a"; //pattern
													// Pattern.matches 가 true or false 반환
		boolean b1 = Pattern.matches(p1, s1);		// true  
		
		System.out.println(b1);
		
		System.out.println(Pattern.matches(p1, "b"));		//false
		System.out.println(Pattern.matches(p1, "c"));		//false
		System.out.println(Pattern.matches(p1, "aa"));		//false    p1은 a하나라서 2개있는거랑 달라
		
		
		System.out.println("=======================================");
		
		String p2 = "b";
		System.out.println(Pattern.matches(p2, "a"));		//false
		System.out.println(Pattern.matches(p2, "b"));		//false
		System.out.println(Pattern.matches(p2, "bb"));		//false
		System.out.println(Pattern.matches(p2, "B"));		//false 대소문자 구별됨 근데 코드입력에따라 가능하게 할수도
		
		
		
		
	}
}
