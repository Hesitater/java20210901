package p08interface.p01textbook.p03lecture.P07anonymous_class_abstract_class;

public class Example2 {
	public static void main(String[] args) {
		
		MyAbstractClass2 o1 = new MyAbstractClass2() {

			@Override
			public void method2() {
				System.out.println("추상메서드 재정의");
			}

			
		};
		//재정의 하지 않았지만 상속한 클래스의 몸통이 아무것도 작성 되지 않았지만
		// 상위 클래스의 메서드를 받고 있기떄문에
		//추상 메서드가 존재하면 재정해야됨
		
		o1.method1();
		o1.method2();
		
		
	}
}
