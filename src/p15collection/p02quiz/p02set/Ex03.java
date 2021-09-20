package p15collection.p02quiz.p02set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public Set<Integer> dupSet(int[] arr) {
		// arr 배열에 중복된 값들만 set에 모아서 리턴
		
		Set<Integer> set = new HashSet<>();
		Set<Integer> result = new HashSet<>();		//중복된값을 result에 넣는다
		
		for (int e : arr) {
			if(set.contains(e)) {
				result.add(e);
			} else {
				set.add(e);
			}
		}
		return result;
//		
//		Set<Integer> s = new HashSet<>();
//		Arrays.sort(arr);
//		
//		for( int i = 1; i < arr.length; i ++) {
//			if( arr[i] == arr[i-1]) {
//				s.add(i);
//			}
//		}
//		
//		return s;
	}
}
