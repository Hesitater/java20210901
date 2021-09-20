package p11api.p03object.p02hashcode;

public class Ex03 {
	public static void main(String[] args) {
//		서로 다른 객체가 같은 hashcode를 가질 수있다.
//		같은 객체이면 같은 hashcode를 가져야한다.
		
		Book b1 = new Book();
		Book b2 = b1;
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		Book b3 = new Book();
		System.out.println(b3.hashCode());			
	}
}


class Book {
	@Override
	public int hashCode() {
//		return 300;
		return (int)(Math.random()*100);		//해코드에서 랜덤으로 하면 안되 같은 객체이면 같은hashcode를가져야하므로
	}
}