package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex03String {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
//		list.add(3);  		// 타입을 String으로 했기때문이 Integer가 안들어감 컴파일오류
		
		list.add("java");
		list.add("spring");
		list.add("js");
		
		System.out.println(list.size());
		
		//for문으로 탐색 가능
		for (int i = 0; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
		
		list.add("boot");
		list.add("list");
		
		System.out.println("아이템 추가한 배열의 크기" + list.size());
		
		//향상된 for문으로 탐색가능
		for(String str : list) {
			System.out.println((str));
		}
		
		System.out.println("===============");
		
		//14장 꺼 맛만보기 (람다식활용) 나중에 보기
		list.forEach(str -> System.out.println(str));
		
		System.out.println(list);		// autoboxing으로 가능
		
	}
}
