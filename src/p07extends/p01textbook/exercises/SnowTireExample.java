package p07extends.p01textbook.exercises;

public class SnowTireExample {
	public static void main(String[] args) {
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
		
		// 1번 : 같은 코드 run 이 실행된다.  O
		// 2번 : 서로 다른코드가 실행될 수도 있다.  X
		
		 int result = Math.abs(-1);
		 System.out.println(result);
	}
}
