package p06class.p03lecture.p01static;

public class StaticEx04ClassInstatnce {
	public static void main(String[] args) {
		
		Class04.value2 = 10000;
//		Class04.value1 = 20000;  // 안됨 인스턴스가 존재해야만 가능합니다.
		
		Class04 c1 = new Class04();
		c1.value1 = 1000;
		
		
		Class04 c2 = new Class04();
		c2.value1 = 2000;
		
		System.out.println(c1.value1);
		System.out.println(c2.value1);
		
		//static  클래스의 대한 정보
		System.out.println(Class04.value2);
		System.out.println(c1.value2);
		System.out.println(c2.value2);
		
		
		
	}
}


class Class04 {
	
	// 인스턴스변수, (인스턴스) 필드, 멤버 변수
	public int value1;
	
	// 스태틱 변수, 클래스 변수, 클래스 필드, 클래스 멤버 변수
	public static int value2;
	
}