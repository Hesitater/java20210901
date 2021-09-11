package p07extends.p01textbook.s070704;

public class DriveExample {
		public static void main(String[] args) {
			
			Driver driver = new Driver();
	
			Vehicle v1 = new Vehicle();
			Bus v2 = new Bus();
			Vehicle v3 = new Taxi();
	
	
			driver.drive(v1);
			driver.drive(v2);
			driver.drive(v3);	// Vehicle 이 Taxi다
			
			
	
	
	
		}
	
}
