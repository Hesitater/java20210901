package p08interface.p01textbook.p03lecture.p02default_method;

public class Example1 {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.sit();
		d1.roll();
		
		
		
		Cat c1 = new Cat();
		c1.sit();
		c1.roll();
		
		Pet p1 = c1;     //Cat에서 온게 아니라는거 증명
		p1.roll();
		
		
		// 추상클래스				   vs  		인터페이스
		// 4가지접근지정자 사용가능				public 메소드만가능
		//인스턴스 필드 사용가능				스테틱 파이널 필드만 가능
		//하나만 상속가능						여러 인터페이스 구현가능
		
	}
}