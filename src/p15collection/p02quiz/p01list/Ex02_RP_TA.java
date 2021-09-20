package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_RP_TA {
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
			case 2 :	
				if (list.size()> 0) {
//				if (list.isEmpty()) {
					list.remove(list.size()-1);
				}
				break;
			case 3 :
				int sum = 0;
				int max = 0;
				int min = 0;
				
				for (Integer item : list) {        //for (int item : list) {  도가능 autoboxing 때문에
					sum = sum + item;			
				}
				
				double avg = sum /(double) list.size();
				System.out.println("합계: " + sum);
				System.out.println("평균: " + avg);
				break;
			default:
				if(input >= 50) {
					list.add(input);
				}
				break;
			}
		
		}
	}
}
