package p15collection.p02quiz.p01list;

import java.util.ArrayList;

public class Ex13 {
	public static void main(String[] args) {
		//Math.random() 
		// 1~45 사이의 값 6개 랜덤
		ArrayList<Integer> lotto = new ArrayList<>();
		
		//코드작성
//		while(lotto.size() < 6) {
//			int ran =(int)(Math.random()*45) +1;
//			
//			if(!lotto.contains(ran)) {
//				lotto.add(ran);
//			}
//		}
//		
//		
//		for ( int l : lotto) {
//			System.out.println(l);  //6개 랜덤
//		}
		

		
		for (int i = 0; i <6; i++) {
			int ran =(int)(Math.random()*45) +1;
			
			lotto.add(ran);
			if(!lotto.contains(ran)) {
				int ran1 =(int)(Math.random()*45) +1;
				lotto.add(ran1);
			}
		}
		
		
		for ( int l : lotto) {
			System.out.println(l);  //6개 랜덤
		}
		
	}
}
