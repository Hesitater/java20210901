package p11api.p03object.p03equals;

import java.util.HashSet;
import java.util.Set;

public class Ex03Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();		//패키지는 java.util 안에 있음
		
		System.out.println(set.size());  		// 0
		
		set.add("java");
		System.out.println(set.size());			// 1 (가지고 있는 객체의 수)
		
		set.add("spring");
		System.out.println(set.size()); 		// 2
		
		set.add("java");
		System.out.println(set.size());  		// 2개  (같은객체는 담겨지지 않으니깐 집합개념)
		
		
		
		
	}
}
