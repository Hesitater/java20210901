package p08interface.p01textbook.p01textbook.s080504;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.run();
		taxi.run();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		
		
	}
}
