package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_RPlus {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.print("0:종료, 1:출력, 2:삭제, 3:합계 4:통계 점수(50이상)");
			int input = scanner.nextInt();

			switch (input) {
			case 0:
				run = false;
				break;
			case 1:
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				break;
			case 2:
				if (list.size() > 0) {
//				if (list.isEmpty()) {
					list.remove(list.size() - 1);
				}
				break;
			case 3:
				int sum = 0;
				double avg = 0.0;
				for ( int i = 0; i < list.size(); i++) {
					sum += list.get(i);
				}
				for ( int i = 0; i < list.size(); i ++) {
					avg += (double)(list.get(i)) / list.size();
				}
				System.out.println("합: " + sum);
				System.out.println("평균: " + avg);
				break;
			default:
				if (input >= 50) {
					list.add(input);
				}
				break;
			}

		}
	}
}
