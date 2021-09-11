package p08interface.p01textbook.p03lecture.p05casting;

import java.io.Serializable;

public class Example2 {
	public static void main(String[] args) {
		
		String str = "java";   								//1번
		method(str);
		
		int[] arr = {1,2};											//7번
		method(arr);
		
		System.out.println("프로그램 정상 종료"); 			//6번
	}

	
	public static void method(Object o) {
		// 하위 타입으로 강제 형변환
		String s = (String) o;								//2번	//8번 에서 막힘 int는 String 이 안되서
		Serializable se = (Serializable) o ;				//3번
		Comparable<String> com = (Comparable<String>) o;	//4번
		CharSequence c = (CharSequence) o;					//5번
		
		
	}
	
}
