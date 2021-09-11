package p07extends.p03lecture.p03abstract_method;

public abstract class Animal {
	
	
	//추상 메소드가 있는 클래스는 반드시 추상 클래스 이어야함
	// pubic  abstract clss 가 존재
	
	
	public abstract void cry(); // 추상 메소드 (몸통없는 메소드)
	
	public void walk() {
		System.out.println("네바롤 걷는다.");
	}
	
	
	
	
}
