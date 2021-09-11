package p08interface.p01textbook.exercises;

public class SoundableExample {
	private static void printSound(Soundable soundable) {	// 강제로 보장이 됨
		System.out.println(soundable.sound());				// 실제 인스턴스의 메서드가 실행됨
	}
	
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
		
		
	}
}
