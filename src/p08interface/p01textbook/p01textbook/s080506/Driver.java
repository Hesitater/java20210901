package p08interface.p01textbook.p01textbook.s080506;

import p08interface.p01textbook.p01textbook.s080505.Bus;
import p08interface.p01textbook.p01textbook.s080505.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		
		if( vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();				// Bus 타입으로 강제 타입 변환을 하는 이유
		}
		
		vehicle.run();
		
	}
}
