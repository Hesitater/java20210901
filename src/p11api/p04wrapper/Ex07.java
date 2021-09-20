package p11api.p04wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 11;
		arr1[1]	= 22;
		arr1[2] = 33;
		
		//어떠한 이유로 배열의 길이가 늘어 난다면 다시 만들어서 사용해야됨
		
		int[] arr2 =Arrays.copyOf(arr1, 5);			//배열길이 복사 메소드 
		System.out.println(Arrays.toString(arr2));	// 교재 167쪽 for문으로 배열복사 참조해보기
		
		// ArrayList
		System.out.println("========================");
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		list1.add("html");
		
		System.out.println(list1);
										// 특정자바유틸들은 참조타입만 받을수있기때문에 변환을 한다.
		// int in ArrayList				//콜렉션 객체를 담고 있는 객체 라서 기본타입을 담을 수 없다
		System.out.println("=========================");
//		ArrayList<int> list2 = new ArrayList<>();		//기본 타입을 담을 수 없다.
		ArrayList<Integer> list2 = new ArrayList<>();   // 참조타입은 담을 수 있네용
		list2.add(new Integer(100));
		System.out.println(list2);
		
		list2.add(new Integer(101));
		System.out.println(list2);				// 기본타입 int가 아니라 참조타입 Integer들이 담겨져 있다.
		list2.add(300); 		// auto unboxing
		list2.add(400);
		list2.add(null);
		
		System.out.println(list2);
		
		Integer i3 = list2.get(2);    // get 메소드는 Integer 타입만 리턴
		
		System.out.println(i3);
		
		int i4 = list2.get(2);       // 오토 언박싱
		System.out.println(i4);
		
		if (list2.get(2) != null ) {			// 이전 방식
			int i5 = list2.get(2).intValue();
			System.out.println(i5);
		}
		
//		int i6 = list2.get(4);				// nullPointerException 일어남 null이 들어가서
//		System.out.println(i6);
		
	}
}
