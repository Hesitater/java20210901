package p11api.p02quiz;

import java.util.Scanner;

public class Ex01Length {
	public static void main(String[] args) {
		// scanner
		// loop
		// 입력받은값

		Scanner scan = new Scanner(System.in);

		boolean run = true;
		
		while (run) {

			System.out.print("입력> ");
			String str = scan.next();		//nextLine() 쓰면 공백도 포함
			
			if(str.equals("quit")) {
				break;
			}
			System.out.println(str.length() + "글자입니다");
		}
		
		scan.close();
	}
}
