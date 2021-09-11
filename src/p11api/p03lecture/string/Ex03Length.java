package p11api.p03lecture.string;

public class Ex03Length {
	public static void main(String[] args) {
		
		// 문자열 길이, 글자의개수 구하고 싶을때.
		String s1 = "java";
		
		System.out.println(s1.length());
		
		String s2 = "spring";
		System.out.println(s2.length());
		
		String s3 = " java";				//스페이스바 사용도 문자길이 포함
		System.out.println(s3);
		
		String s4 = "         ";
		System.out.println(s4.length());
		
		String s5 = "가a";
		System.out.println(s5.length());
		
		String s6 = "j\ta";			// escape문자 도 가능
		System.out.println(s6);
		System.out.println(s6.length()); // \t가 글자 한개 취급
		
		String s7 = "j\na";
		System.out.println(s7);
		System.out.println(s7.length());	//\n 글자 한개 취급
		
		// \t : tab  ,  \n : new Line
		
	}
}
