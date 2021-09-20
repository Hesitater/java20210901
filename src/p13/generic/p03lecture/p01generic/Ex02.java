package p13.generic.p03lecture.p01generic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Ex02 {
	public static void main(String[] args) {
		Container<String,Integer> c1;
		c1 = new Container<String,Integer>();
		
		c1.setItem1("html");
		c1.setItem2(1234);
		
		String s1 = c1.getItem1();
		Integer i1 = c1.getItem2();
		
		System.out.println(s1);
		System.out.println(i1);
		
		System.out.println("=======================");
		
//		Container<Double, int[]> c2 = new Container<Double, int[]>();
		Container<Double, int[]> c2 = new Container<>();
		c2.setItem1(3.14);
		c2.setItem2(new int[] {1, 2, 3});
		
		Double d1 = c2.getItem1();
		int[] arr1 = c2.getItem2();
		
		System.out.println(d1);
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("=======================");
		
		Container<List<List<String>>,Map<String, Integer>> c3 = new Container<>();
		Container<? extends Number, Object> c4 = new Container<Integer, Object>();
		Container<? extends Number, Object> c5 = new Container<>();
		
		
	}
}

class Container<T,U> {     // 2개의 필드를 나중에 결정될 타입으로
	private T item1;
	private U item2;
	
	Container() {
		
	}
	
	Container(T item1, U item2) { 		//생성자에도 사용이 가능하다
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T getItem1() {
		return item1;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public U getItem2() {
		return item2;
	}
	public void setItem2(U item2) {
		this.item2 = item2;
	}
	
	
}