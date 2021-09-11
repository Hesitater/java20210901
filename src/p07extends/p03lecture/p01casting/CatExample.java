package p07extends.p03lecture.p01casting;

public class CatExample {
	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		
		a1.walk();

//		a1.punch();  // 동물에 punch가 없어서 사용이 안되네?
		
		
		Cat c1 = (Cat) a1;   //강제 형변환(Casting)  동물에 punch가없어서 
		c1.punch();
		c1.walk(); 			// walk는 Animal꺼라 그냥 사용 가능
		
		
		
		
		
	}
}
