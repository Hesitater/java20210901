package p11api.p03object.p01toString;

public class Ex01 {
	public static void main(String[] args) {
		//toString : 객체의 설명
		
		Object o1 = new Object();
		Object o2 = new Object();
		String s1 ="spring";
		
		System.out.println(o1.toString());		//@앞에는 객체타입 @뒤에는 hashcode로 이루어짐
		System.out.println(o2.toString());		//객체가 다르니 값도 다르다.
		System.out.println(s1.toString());		
		// String이 가지고 있는 toString은 메서드재정의가 되었다고 유추 가능 실제로도 재정의됨

		
	}
}
