package p08interface.p01textbook.p01textbook.s080506;

import p08interface.p01textbook.p01textbook.s080505.Vehicle;

public class Taxi implements Vehicle {
		
	@Override								//택시 추가에서 확인
	public void run() {
		System.out.println("택시가 달립니다");
	}
}
