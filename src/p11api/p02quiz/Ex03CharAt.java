package p11api.p02quiz;

import java.util.Scanner;

public class Ex03CharAt {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력 : ");
			String input = scanner.next();
			
			if (input.equals("q")) {
				break;
			}
			
			int len = input.length();
			int center = len / 2;
			
			System.out.println("가운데 문자는:" + input.charAt(center));
			System.out.println("가운데 문자는:" + input.charAt(input.length() /2));
		}
		
		
		
		
		
		
		
		
		
		// String s1 = "apple";
//		int len1 = s1.length();
//		int c1 = len1 / 2;
//		
//		System.out.println(s1.charAt(c1));
//		
//		String s2 = "홍길동";
//		int len2 = s2.length();
//		int c2 = len2 / 2 ;
//		System.out.println(s2.charAt(c2));
//		
//		String s3 ="spring";
//		int len3 = s3.length();
//		int c3 = len3 / 2 ;
//		System.out.println(s3.charAt(c3));

	}
}
