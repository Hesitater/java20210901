package p07extends.p01textbook.s070804;

public class Cat extends Animal {

	//상위 클래스가 추상 메소드를 가지고 있다면
	//하위 클래스가 실체 클래스 일때
	//꼭 추상 메소드를 재정의해야함.
	
	@Override
	public void sound() {
		System.out.println("냥냥");
	}
	
}
