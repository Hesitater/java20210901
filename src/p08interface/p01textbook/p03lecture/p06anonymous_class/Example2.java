package p08interface.p01textbook.p03lecture.p06anonymous_class;

public class Example2 {
	public static void main(String[] args) {
		
		// 클래스 작성, 객체 생성 동시에
		// 구현 클래스는 추상메소드를 꼭 재정의 해야되용!
		MyInterface2 i1 = new MyInterface2() {
			
			@Override
			public void method1() {
				System.out.println("구현 클래스의 메소드1");
			}
		};
		
		
		
		
	}
}
