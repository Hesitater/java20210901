package p08interface.p01textbook.p01textbook.s080503;

import p08interface.p01textbook.p01textbook.s080502.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();		//tires 배열의 0,1인덱스에 KumhoTire 넣는다
		myCar.tires[1] = new KumhoTire();		// KumhoTire implements Tire 가 되니깐
		
		
		myCar.run();
		
		
	}
}
