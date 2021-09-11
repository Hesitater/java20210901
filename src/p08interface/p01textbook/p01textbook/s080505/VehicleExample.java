package p08interface.p01textbook.p01textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();  		// vehicle 타입에는 checkFare 메서드가 없어
		
		
		// checkFare메서드를 사용 하고 싶어서  vehicle를 강제 형변환해서 사용 
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
		
	}
}
