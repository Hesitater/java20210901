package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_MAXMIN {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.print("0:종료, 1:출력 점수(50이상)");
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
				

				for (Integer item : list) { // for (int item : list) { 도가능 autoboxing 때문에
					sum = sum + item;
				}
				double avg = sum / (double) list.size();
				
				int max = max(list);
				int min= min(list);
				
				System.out.println("합계: " + sum);
				System.out.println("평균: " + avg);
				System.out.println("최댓값:"  + max);
				System.out.println("최솟값: " + min);
				
				break;
			default:
				if (input >= 50) {
					list.add(input);
				}
				break;
			}

		}
	}

	private static int max(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			return 0;
		}
		int max = list.get(0);
		
		for (int i = 1; i < list.size(); i++) {
			if ( max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
		}
	private static int min(ArrayList<Integer> list ) {
		if (list.isEmpty() ) {
			return 0;
		}
		
		int min = list.get(0);
		
		for (int i = 0; i <list.size(); i++) {
			if( min < list.get(i) ) {
				min = min;
			}
		}
		return min;
		
	}
 }
