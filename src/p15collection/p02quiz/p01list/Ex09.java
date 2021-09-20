package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex09 {
	public void removeLastMax(List<Integer> list) {
		//list의 마지막 가장 큰값을 삭제

		int index = list.size() -1;
		int max = list.get(list.size()-1);
		
		for ( int i = list.size()-2; i >= 0; i--) {
			if (list.get(i) > max) {
				max = list.get(i);
				index = i;
			}
		}
		list.remove(index);
		
		
		
		
//		
//		int max = list.get(0);
//		int index = 0;
//		
//		for (int i =1; i < list.size(); i++) {
//			if( max <= list.get(i) ) {
//				max = list.get(i);
//				index = i;
//			}
//		}
//		System.out.println(list.lastIndexOf(max));
		
	}
}
