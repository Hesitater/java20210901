package p15collection.p03lecture.p01list;

import java.util.Arrays;

public class Ex01Array {
	public static void main(String[] args) {
		int[] arr1 = new int[3];  			//배열 만들려면 크기를 지정
		
		arr1[0] = 999;
		arr1[1] = 888;
		arr1[2] = 777;
		
		// 근데 내가  좀더 큰 배열을사용하고 싶었엉
		
		int[] arr2 = new int[6];
		
		for(int i= 0; i <arr1.length; i++) {		//for문을 이용해서 배열에 넣기
			arr2[i] = arr1[i];
		}
		
		System.out.println(Arrays.toString(arr2));
		
	}
}
