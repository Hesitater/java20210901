package p08interface.p01textbook.p01textbook.s080505;

public class Bus implements Vehicle {
	
	@Override
	public void run() {						// Vehicle 강제로 재정의
		System.out.println("버스가 달립니다.");
	}

	public void checkFare() {				//걍 메서드 따로 만듬
		System.out.println("승차요금을 체크합니다.");
	}
	
	
}
