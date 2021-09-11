package p08interface.p01textbook.p02quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Example2AnonymousClass {
	public static void main(String[] args) {
		String[] arr = {"java", "bootstrap", "react", "vue", "angular", "jstl", "spring"};
		
		System.out.println(Arrays.toString(arr));
		
		//z -> a 출력되도록 하세요
		Arrays.sort(arr, Collections.reverseOrder());
		
//		Arrays.sort(arr, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//
//				return o2.compareTo(o1);   // o1.compareTo(o1) , o2.compareTo(o1) 비교
//			}
//
//		});
		
		System.out.println(Arrays.toString(arr));
			
			
	}
}
