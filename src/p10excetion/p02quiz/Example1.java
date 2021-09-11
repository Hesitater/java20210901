package p10excetion.p02quiz;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");			//1번쨰
		
		method1(null);									//2번째
		
		System.out.println("프로그램 종료");			//5번쨰 
		
	}
	
	public static void method1(Object o) {				
		try {
			System.out.println(o.hashCode());			//3번쨰
		} catch (NullPointerException e) {
			System.out.println("널포인트익셉션");		//4번쨰
		}
	}
}
