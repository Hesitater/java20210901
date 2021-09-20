package p11api.p03object.p01toString;

public class Ex03 {
	public static void main(String[] args) {
		Account a1 = new Account("333-333", "son", 30000);
		
		System.out.println(a1.toString());
		System.out.println(a1);					//print출력문이 toString
		System.out.println(String.valueOf(a1));		//a1이 null이아니면 obj.toString() 을 리턴
		
		
		
	}
}
