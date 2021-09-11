package p11api.p03lecture.string;

public class Ex07CharAt {
	public static void main(String[] args) {
		//charAt
		
		String s1 = "java";
		
		System.out.println(s1.charAt(0));
		
		char c = s1.charAt(1);
		System.out.println(c);
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		
		
//		char d = s1.charAt(4); 		//인덱스 번호 벗어나면 exception
//		System.out.println(d);
		
	}
}
