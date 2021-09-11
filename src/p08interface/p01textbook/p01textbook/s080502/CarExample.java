package p08interface.p01textbook.p01textbook.s080502;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car yourCar = new Car();
		
		
		
		
		myCar.run();			// 4개의 한국타이어를 메소드 실행시킴
		
		myCar.frontLeftTire = new KumhoTire();			//앞바퀴 2개를 금호타이어로 변경
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();				
		
		
		
		yourCar.run();			//Car인스턴스를 만들때 초기값 4개가 한국타이어라서 
		
		
		
	}
}
