package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex07 {
	public int countOnlyLetter(String str) {
		// 한번만 사용된 문자의 개수
		//선생님 답변
//		Set<Character> set = new HashSet<>();
//		Set<Character> dup = new HashSet<>();
//
//		for (int i = 0; i <str.length(); i++ ) {
//			char c = str.charAt(i);
//			
//			if(set.contains(c)) {
//				dup.add(c);
//			} else {
//				set.add(c);
//			}
//		}
//		
//		
//		for ( Character c: dup) {
//			set.remove(c);
//		}
//		
//		
//		return set.size();

//		Set<Character> set = new HashSet<>();
//		Set<Character> db = new HashSet<>();
//
//		for (int i = 0; i < str.length(); i++) {
//
//			if (set.contains(str.charAt(i))) {
//				db.add(str.charAt(i));
//			} else {
//				set.add(str.charAt(i));
//			}
//
//		}
//
//		for (char a : set) {
//			if (db.contains(a)) {
//				set.remove(a);
//			}
//
//		}
//
//		return set.size();

//		
		Set<Character> set = new HashSet<>();
		Set<Character> db = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {

			if (set.contains(str.charAt(i))) {
				db.add(str.charAt(i));
			} else {
				set.add(str.charAt(i));
			}

		}
		Iterator<Character> iterator = set.iterator();
		while (iterator.hasNext()) {
			if (db.contains(iterator.next())) {
				iterator.remove();
			}

		}

		return set.size();

	}
}
