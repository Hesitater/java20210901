package p12thread.p03lecture.p02runnable;

public class Ex02AnonymousClass {
	public static void main(String[] args) {
		MyInterface o1 = new MyClass();
		o1.method1();
		
		// 인터페이스 구현과 객체생성을 한번에
		MyInterface o2 = new MyInterface() {   //클래스의 몸통
			public void method1() {    
				System.out.println("무명 클래스 메소드 재정의");
			}
		};
		o2.method1();
		
		
	}
}

interface MyInterface {
	void method1();
}

class MyClass implements MyInterface {
	@Override
	public void method1() {
		System.out.println("메소드 재정의");
	}
	
}