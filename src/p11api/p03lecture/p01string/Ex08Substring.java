package p11api.p03lecture.p01string;

public class Ex08Substring {
	public static void main(String[] args) {
		//substring
		
		String s1 = "javascript";
		
		String sub1 = s1.substring(4); 		//4번 인덱스로 부터 끝까지 부분 문자열 리턴
		
		System.out.println(sub1);			// script 출력
		
		String sub2 = s1.substring(0, 4);  // 0번 인덱스부터 3번인덱스까지의 부분 문자열 리턴
										   // 0번부터 (4-1)번까지, 4번은 포함안됨
		System.out.println(sub2);		   // java 출력
	
	}
}
