package p13.generic.p03lecture.p01notgeneric;

public class EX01 {
	public static void main(String[] args) {
		
		Box b1 = new Box();
		
		b1.setItem("java");				//String은 Object이니깐 들어갈수 있쥬?
//		String s = b1.getItem();		// Object는 String이 아니니깐 컴파일에러가 남
		Object q = b1.getItem();		// String은 Object이니깐 가능
		
		String s = (String) b1.getItem();	//강제 형 변환해서 사용 가능
		
		System.out.println("아이템 길이:" + s.length());
		
		b1.setItem(3); 						//int 넣엇지만 auto boxing 되어서 Integer로
		
//		Integer i = b1.getItem(); 			// Object는 Integer가 아니라서 컴파일 에러남
		Integer i = (int) b1.getItem();		// 강제 형변환해서 사용 가능
		
		System.out.println("아이템 값:" + i);
		
		b1.setItem("html");
		
		Integer j = (Integer) b1.getItem();;  // ClassCastException
		
		
	}
}

class Box {
	private Object item;


	public void setItem(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return item;
	}
	
}