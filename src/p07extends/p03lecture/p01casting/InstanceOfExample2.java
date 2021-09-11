package p07extends.p03lecture.p01casting;

public class InstanceOfExample2 {
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		
		
		// 객체 instanceof 타입 좌항의 객체가 우항의 인스턴스 이면
		// 즉 우항의 타입으로 객체가 생성되었다면 true 아니면 false
		System.out.println(a1 instanceof Animal);		//true
		System.out.println(a1 instanceof Dog); 			//false
		System.out.println(a1 instanceof Cat); 			//false
		
		System.out.println(c1 instanceof Cat);			//true
//		System.out.println(c1 instanceof Dog); 			// compile error
		System.out.println(c1 instanceof Animal);		//true
		
		System.out.println(d1 instanceof Dog);			//true
		System.out.println(d1 instanceof Animal); 		//true
//		System.out.println(d1 instanceof Cat); 			//compile error
		
	}
}
