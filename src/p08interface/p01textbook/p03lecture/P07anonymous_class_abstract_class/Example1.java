package p08interface.p01textbook.p03lecture.P07anonymous_class_abstract_class;

public class Example1 {
	public static void main(String[] args) {
		
//		MyAbstractClass1 o1 = new MyAbstractClass1(); // 안됨
		
		//추상 클래스 구현, 인스턴스 생성 동시
		MyAbstractClass1 o2 = new MyAbstractClass1() {
			
		}; //가능
		
	}
}
