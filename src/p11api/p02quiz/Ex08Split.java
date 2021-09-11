package p11api.p02quiz;

import java.util.Scanner;

public class Ex08Split {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력문자열:");
		String input = scanner.nextLine();
		
		System.out.print("구분자:");
		String dm = scanner.nextLine();
		
		
		// 코드 작성
		String[] strings = input.split(dm);
		for (String item : strings) {
			System.out.println(item);
		}
		
		
		scanner.close();
		
		
	}
}
