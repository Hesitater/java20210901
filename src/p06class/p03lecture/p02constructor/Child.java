package p06class.p03lecture.p02constructor;

public class Child extends Parent {		//customException
	
	public Child(String name) {
		super (name);
//		this.name = name; // 부모가한일을 나도 하고싶다.
//		근데 private String name; 이라 접근을 못해서 super()를 사용
	}
	
}
