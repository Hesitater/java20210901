package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
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
				
			default:
				if(input >= 50) {
					list.add(input);
				}
				break;
			}

		
		
		}
		
		
		
		
		
		
		
		
		
//		ArrayList<Integer> list = new ArrayList<>();
//		Scanner scanner = new Scanner(System.in);
//		boolean run = true;
//		
//		
//	while (run) {
//		System.out.print("0:종료, 1: 출력 점수 (50이상)>");
//		int x = scanner.nextInt();
//		
//		if( x == 0) {
//			break;
//		} else if( x == 1) {
//			for (int y : list) {
//				System.out.println(y);
//			}
//		} else if ( x >= 50) {
//			list.add(x);
//		}
//		
//	}
		
			
	}
}
