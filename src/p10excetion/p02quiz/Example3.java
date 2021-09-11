package p10excetion.p02quiz;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.print("첫번 째 수 입력:");
			String str1 = scanner.next();

			System.out.print("두번 째 수 입력:");
			String str2 = scanner.next();

			try {
				int n1 = Integer.parseInt(str1);
				int n2 = Integer.parseInt(str2);

				System.out.println("더한 결과는 : " + (n1 + n2));
			} catch (NumberFormatException e) {
				System.out.println("잘 못 입력하셨습니다.");
			}
		}

		scanner.close();

	}
}
