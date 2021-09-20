package p11api.p03object.p01toString;

public class CarDTO {
	private String mode;
	private String company;
	private int price;
	private long id;
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "CarDTO [mode=" + mode + ", company=" + company + ", price=" + price + ", id=" + id + "]";
	}
	
	
	
	
	
}
