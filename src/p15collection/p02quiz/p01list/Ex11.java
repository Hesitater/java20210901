package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
	public ArrayList<Integer> minMax(List<Integer> list) {
		
		// 파라티머로 받은 list의 최솟값, 최댓값을 아이템으로 갖는 ArrayList 리턴
//		ArrayList<Integer> result = new ArrayList<>();
//		
//		int max = list.get(0);
//		int min = list.get(0);
//		
//		for (int i = 1; i < list.size(); i++) {
//			if( max < list.get(i)) {
//				max = list.get(i);
//			} 
//			if( min < list.get(i)) {
//				min = min;
//			}
//			
//		}
//		result.add(min);
//		result.add(max);
//		
//		
//		return result;
		
		ArrayList<Integer> result = new ArrayList<>();
		
		int min = list.get(0);
		int max = list.get(0);
		
		for (int item : list) {
			min = Math.min(min, item);
			max = Math.max(max, item);
		}
		
		result.add(min);
		result.add(max);
		
		return result;
	}
	
}
