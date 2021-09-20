package p15collection.p02quiz.p02set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex06 {
	public int dupLetter(String str) {
		// 몇개의 문자가 중복이 되었는지..
		
		// 선생님해주신거
		Set<Character> set = new HashSet<>();
		Set<Character> dup = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++ ) {
			char c = str.charAt(i);
			
			if(set.contains(c)) {
				dup.add(c);
			} else {
				set.add(c);
			}
		}
		
		return dup.size();
		
		//내 답변
//		Set<Character> set = new HashSet<>();
//		Set<Character> result = new HashSet<>();
//		
//		 for ( int i = 0; i <str.length(); i++) {
//			 if(set.contains(str.charAt(i))) {
//				 result.add(str.charAt(i));
//			 } else {
//				 set.add(str.charAt(i));
//			 }
//		 }
//		
//		return result.size();
	}
}
