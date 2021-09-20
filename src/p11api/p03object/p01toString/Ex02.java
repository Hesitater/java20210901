package p11api.p03object.p01toString;

public class Ex02 {
	public static void main(String[] args) {
		Account a1 = new Account("111-111","kim",10000);
		System.out.println(a1.toString());				//object를 상속받기때문에 오류 안남
		
		Object o1 = a1;
		System.out.println(o1.toString());			// 실제 인스턴스 메소드가 실행되기때문에
		
		Account a2 = new Account("222-222", "lee", 20000);
		System.out.println(a2.toString());
		
		a2.setBalance(30000);
		System.out.println(a2.toString());			//이 객체의 잔액을 30000으로 변경.
		
	}
}
