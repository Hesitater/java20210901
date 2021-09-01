package p01review;

public class C03Polymorphism {
	public static void main(String[] args) {
		
		Gun g1 = new Gun();
		
		Hero hero = new Hero();
		hero.setGun(g1);
		
		System.out.println("-공격합니다.");
		hero.attack();
		
		System.out.println("-불총을 습득했다.");  // class Hero를 건들지 않고 다형성으로 작성
		hero.setGun(new FireGun());
		
		System.out.println("- 다시공격합니다.");
		hero.attack();
		
		
	}
}	


class Hero {
	private Gun gun;


	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void attack() {
		gun.fire();
	}
	
}


 		// 예시

class Gun {
	
	public void fire() {
		System.out.println("총을 쏩니다.");
	
	}
	
}

class FireGun extends Gun {  //불총이 Gun을 상속 받으면
	@Override
	public void fire() {
		System.out.println("불을 쏩니다.");
	}
}






