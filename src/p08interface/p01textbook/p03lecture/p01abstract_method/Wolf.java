package p08interface.p01textbook.p03lecture.p01abstract_method;

public class Wolf extends KindaDog implements SledDog {

	@Override
	public void bark() {
		System.out.println("월얼");
	}
	
	@Override
	public void pull() {
		System.out.println("늑대가 썰매를 끕니다.");
	}

}
