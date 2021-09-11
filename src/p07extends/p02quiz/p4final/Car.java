package p07extends.p02quiz.p4final;

public class Car {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.model);
		
		Car c2= new Car("현대");
		System.out.println(c2.getModel());
		
		
		
	}
	
	private final String model;
	
	public Car() {
		model = "kia";
				
	}
	
	public Car (String model) {
		this.model = model;
	}
	
	
	public String getModel() {
		return model;
	}
	
}
