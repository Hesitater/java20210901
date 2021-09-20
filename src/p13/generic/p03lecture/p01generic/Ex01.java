package p13.generic.p03lecture.p01generic;

public class Ex01 {
	public static void main(String[] args) {
		Box<String> b1;
		Box<Integer> b2;
		
		b1 = new Box<String>();
		b2 = new Box<Integer>();
		
//		b1.setItem(2); 				//Integer는 String이 아니니깐 넣을 수 없다
//		b2.setItem("스트링아냐");   // String은 Integer가 아니니깐 넣을 수 없다
		
		b1.setItem("스트링");
		b2.setItem(7047);
		
		String s = b1.getItem();		//Casting은안하니 ClassCastException가 안일어남
		Integer i = b2.getItem();		//Casting은안하니 ClassCastException가 안일어남
		
		System.out.println(s.length());
		System.out.println(i.intValue());
		
	}
}

class Box<T> {
	private T item;  
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
}