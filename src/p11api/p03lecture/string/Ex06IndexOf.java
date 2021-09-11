package p11api.p03lecture.string;

public class Ex06IndexOf {
	public static void main(String[] args) {
		
		String s1 = "java와 javascript는 java도 opp고 javascript도 opp다";
		
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java"));
		
		System.out.println(s1.indexOf("java", 5));		//(찾을문자,시작인덱스)
		System.out.println(s1.indexOf("java", 10));
		//이런 설명이 api에 나와있다~
		
		
	}
}
