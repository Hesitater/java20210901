package p08interface.p01textbook.p01textbook.s080502;

public class Car {
	
	Tire frontLeftTire = new HankookTire();			//인터페이스 파입 필드 선언과 초기 구현 객채 대입
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	
	
	void run() {						//인터페이스에서 설명된 roll()메소드 호출
		frontLeftTire.roll();			//4개의 타이어에 roll메서드 넣음
		frontRightTire.roll();			// 타이어가 roll 추상메서드를 잘 가지고 있다
		backLeftTire.roll();			
		backRightTire.roll();
		
		
	}
	
}
