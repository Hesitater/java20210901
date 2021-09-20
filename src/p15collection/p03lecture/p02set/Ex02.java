package p15collection.p03lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Set<Integer> set;
//		set = new Set<>(); 			// interface여서 instatnce 만들 수 없음
		set = new HashSet<>();		// 다형성 때문에 가능
		
		set.add(3);
		set.add(33);
		set.add(6);
		
		int size =set.size();
		System.out.println(size);		
		
		set.add(33);				// 존재하지 않을 때만 추가
		System.out.println("중복된 33을 넣은 후 크기" + size); 	// 값이 중복되지 않을때면 추가를 해서 중복된값 추가 안됨
		
		
		/* index로 아이템 접근 불가
		for (int i = 0; i < set.size(); i++) {
			set.get(i);
		}
		*/
		
		System.out.println("-아이템 탐색-");
		// 향상된 for		출력될때 출력 순서 보장이 안됨
		for ( int item : set ) {
			System.out.println(item);
		}
		
		System.out.println("-아이템 검색-");
		boolean b = set.contains(3);		// set 안에 아이템 있나 없나 확인  true/false 로나옴
		System.out.println(b);
		System.out.println(set.contains(5));
		
		System.out.println("-아이템 삭제-");
		set.remove(3);						// 있는 아이템 삭제 하면 크기가 감소 하겠죠?
		System.out.println(set.size());		
		set.remove(5);						// 없는 아이템을 삭제하면 아무일도 일어나지 않음
		System.out.println(set.size());
		
		
		
	}
}
