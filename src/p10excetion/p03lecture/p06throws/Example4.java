package p10excetion.p03lecture.p06throws;

public class Example4 {
	
	public static void main(String[] args) throws Exception {
		System.out.println("프로그램 시작");
		
		method1();
		
		System.out.println("프로그램 종료");
		
	}
	
	public static void method1() throws Exception {
		System.out.println("메소드 1 시작");
		
		method2();
		
		System.out.println("메소드 1 종료");
	}
	
	public static void method2() throws Exception {
		System.out.println("메소드 2 시작");
		
		throw new Exception();					//method2() 안에서 익셉션 발생 
		
//		System.out.println("메소드 2 종료");
	}
}
