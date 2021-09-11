package p07extends.p01textbook.s070804;

public class AnimalExample {
	public static void main(String[] args) {
		
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		a1.sound();
		a2.sound();
		
		System.out.println("=========Teacher=======");
		
		
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		
		cat.sound();
		dog.sound();
		
		System.out.println("-------변수의 자동 타입 변환-------");
		
		//변수의 자동 타입 변환
		
		Animal animal = null;			
		
		animal = new Dog();			//자동 타입 변환
		animal.sound();				//재정의된 메소드 호출
		
		animal = new Cat();			// 자동 타입 변환
		animal.sound();				// 재정의 된 메소드 호출
		
		System.out.println("--------메소드의 다형성---------------");
		
		
		//메소드의 다형성
		animalSound(new Cat());		//자동 타입 변환
		animalSound(new Dog());		//자동 타입 변환
		
		
	}
		
		
		
		public static void animalSound (Animal animal) {
			animal.sound();		// 재정의된 메소드 호출
		}
		
		
		
		
		
		
		
		
		
		
	
}
