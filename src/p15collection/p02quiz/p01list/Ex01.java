package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.print("l ; list, e :exit 입력>");
			String str = scanner.nextLine();
			switch (str) {
			case "l":
				for (String s : list) {
					System.out.println(s);
				}
				break;
			case "e":
				run = false;
				break;
			default:
				list.add(str);
				break;
			}
			
		}
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		List<String> list = new ArrayList<>();
//		
//		boolean run = true;
//		
//		
//		while (run) {
//			System.out.print("l:list, e:exit 입력>");
//			String s = scan.next();
//			list.add(s);
//			
//			if(s.equals("l") ) {
//				for (int i = 0; i < list.size()-1; i++) {
//					System.out.println(list.get(i));
//				}
//			} else if (s.equals("e")) {
//				for (int i = 0; i < list.size()-1; i++) {
//					System.out.println(list.get(i));
//				}
//				break;
//			}
//		}
//		
	}
}
