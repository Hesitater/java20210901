package p11api.p03lecture.string;

public class Ex01String {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);    // 기본타입 제외하면 참조주소값비교라 정확하지않음
		System.out.println(s1.equals(s2));			//참조주소값비교
		System.out.println(s1.contentEquals(s2));	//참조주소값비교
		
	}
}
