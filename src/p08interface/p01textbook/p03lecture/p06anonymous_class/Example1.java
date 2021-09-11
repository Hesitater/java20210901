package p08interface.p01textbook.p03lecture.p06anonymous_class;

public class Example1 {
	public static void main(String[] args) {
		
//		MyInterface1 i1 = new MyInterface1();  //방금 만든 interface로 인스턴스를 만들 수 없다
												// 구현할 클래스가 팔요하다네요?
		
		MyInterface1 i2 = new MyClass1();		
		//MyClass1 implements MyInterface1 구현할 클래스를 만들면 가능
		
		//클래스를 만들고 인스턴스(객체)를 한 번에 만들 수 있음.
		MyInterface1 i3 = new MyInterface1() {
			
		};    // 구현 할 때 interface 클래스도 만들고 인스턴스도 만들고 
		
		// 무명객체 = 익명구현객체
		
		
		
		
	}
}
