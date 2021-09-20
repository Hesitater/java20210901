package p15collection.p01textbook.Example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("JAVA");
		list.add("jDBC");
		list.add("Servlet/JSP");
		list.add(2, "Datebase");
		list.add("iBATIS");
		
		list.forEach(str -> System.out.println(str));
		
		int size = list.size();
		System.out.println("총 객체 수:" +size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2:" + skill);
		System.out.println();
		
		//for문으로 탐색하기
		for(int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2);
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list.get(2));
		
		//for문으로 탐색하기
				for(int i = 0; i <list.size(); i++) {
					String str = list.get(i);
					System.out.println(i + " : " + str);
				}
		
		list.remove("iBATIS");		// 특정아이템이 첫번쨰로 나오는걸 지움
		System.out.println();
		
		//for문으로 탐색하기
			for(int i = 0; i <list.size(); i++) {
				String str = list.get(i);
				System.out.println(i + " : " + str);
			}
		
	}
}
