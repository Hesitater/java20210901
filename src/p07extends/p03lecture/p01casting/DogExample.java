package p07extends.p03lecture.p01casting;

public class DogExample {
	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		
		a1.walk();
		
		Cat c1 = (Cat) a1; 		// 이떄 문제가 생긴거임
		c1.punch();
		
		
		System.out.println("프로그램 정상 종료"); //정상출력됬으면 이게 출력됫을텐데 위에서 문제가 생김
		
	}
}

