package p08interface.p01textbook.p03lecture.p04static_method;

public interface MyInterface {
	
	static void method1() {			// 무조건 public 
		System.out.println("스태틱 메소드");
		System.out.println("클래스 메소드");
		System.out.println("정적 메소드");
		
	}
}
