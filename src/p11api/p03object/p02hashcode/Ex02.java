package p11api.p03object.p02hashcode;

public class Ex02 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());		//Object 해시코드는 객체 주소값을 리턴
		System.out.println(o2.hashCode());
		
		String s1 = new String("spring");
		String s2 = new String("spring");
		
		System.out.println(s1.hashCode());		//다른 객체 인데 해쉬코드 값이 같네? String에서 재정의했나본디?
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2);			// 같은 객체 주소가 아니죠? 근데 hashCode는 같게 나왔네 위에서 재정의했니?
		System.out.println(s1.equals(s2));
		
	}
}
