package p01review;

public class C02polymorphism {


	//다형성
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();  //객체 따로 만들고 참조값만 따로
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		
		a1.cry();
		c1.cry(); 	//기능의재정의(오버라이딩)
		d1.cry();  	// 개는 동물이라서 Animal의 기능을 쓸수 있다.
		
		System.out.println("==================================");
		//instance 
		
		
		
		Animal a2 = c1;    			//고양이는 동물이다
		Animal a3 = d1; 			//개는 동물이다.
									// 참조변수 5개 (a1,c1...) instance 3개 (Animal.Cat,Dog)
		
		a2.cry();	//실제 인스턴스가 실행됩니다.
		a3.cry();
		
		
		
		
		
//		Cat c2 = a1; 			// 동물은 고양이다   안되죠?
//		Dog d2 = a1; 			// 동물은 개 이다   안되용

		
	}
	
}


class Animal {
	
	public void cry() { //Cat,Dog가 다 가지고 있죠? // void instance cry()
		System.out.println("동물이 웁니다.");
	}
}

class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("고양이가 웁니다");
	}
}

class Dog extends Animal {

	
}