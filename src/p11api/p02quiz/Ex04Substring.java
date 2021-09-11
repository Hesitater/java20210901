package p11api.p02quiz;

import java.util.Scanner;

public class Ex04Substring {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력>");
			String str = scanner.next();
			
			if (str.equals("q")) {
				break;
			}
			
			System.out.println("앞절반: " + str.substring(0,str.length()/2));
			System.out.println("뒤절반: " + str.substring(str.length()/2));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String s1 = "spring";
//		int len1 = s1.length();		//길이는 6
//		int c1 = len1 / 2;			// 3
//		
//		String f1 = s1.substring(0, c1);   // 0부터 c1-1 까지 --> 0~2
//		String r1 = s1.substring(c1); 	   // c1부터 끝까지 ==> 3~5
//		
//		System.out.println(f1);
//		System.out.println(r1);
//		
//		System.out.println("=============================================");
//		
//		String s2 = "apple";
//		int len2 = s2.length(); //길이 5
//		int c2 = len2 / 2 ;		// 2
//		
//		String f2 = s2.substring(0, c2);   //0부터 ~ c2-1까지  --> 0~1
//		String r2 = s2.substring(c2);	   // c2 부터~ 끝까지 --> 2~4
//		
//		System.out.println(f2);
//		System.out.println(r2);
//		
		
		
	}
}
