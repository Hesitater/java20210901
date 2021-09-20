package p15collection.p03lecture.p01list;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02ArrayList {
	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr1 = new ArrayList<>();
				//기본 타입은 안됨 autoboxing 으로 가능
		
		//add 
		arr1.add(999);		//autoboxing 되어서 들어감
		arr1.add(888);
		arr1.add(777);
		
		System.out.println((arr1));
		
		
		// size         배열의 크기를 알아 볼수 있는 메소드
		System.out.println("배열의 크기는: " + arr1.size());
		
		arr1.add(666);
		arr1.add(555);
		
		System.out.println("배열의 크기는: " + arr1.size());
	
		// get     아이템은 얻어내는 메소드
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		System.out.println(arr1.get(4));
		
		// remove          중간 아이템은 삭제하는 메소드
		// 중간에 삭제하면 index가 없어지고 크기가 줄어들음
		arr1.remove(3);
		System.out.println("remove(3)을 한 이후 크기: " + arr1.size());
		
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		// 아이탬들이 한칸씩 앞으로 땡겨졌다
		//중간에 아이템이 삭제되면 그다음 아이템들이 한칸씩 땡겨서 온다
		
	}
}
