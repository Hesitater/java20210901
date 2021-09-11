package p08interface.p01textbook.p03lecture.p01abstract_method;

public class Malamute extends KindaDog  implements Pet, SledDog {
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public void sit() {
		System.out.println("자리에 앉아");
	}
	
	@Override
	public void pull() {
		System.out.println("썰매를 끕니다.");
	}
}
