package p11api.p02quiz;

public class Car {
	private String com;
	private int price;

	public Car(String com, int price) {
		super();
		this.com = com;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "회사: " + this.com + ", " + "가격: " + this.price + "원";
	}
}
