package p01review;

public class c01Type {
	public static void main(String[] args) {
		
		//데이터 타입
		// 1. 기본타입(primitive type)
		// -8개
		// byte(1), short(2), int(4), long(8)
		// float(4), double(8)
		// char(2)
		// boolean(1) 
		
		int i =4; 			//직관적으로 알수 있다
		int j = i;
		
		
		
		
		
		// 2. 참조타입( reference type)
		// 기본타입 8개 제외 나머지 모두가 참조타입
		
		int[] arr = {3, 4}; 		//8520
		int[] brr = arr;			//8520
		
		
		brr[0] = 33;
		
		System.out.println(arr[0]);
		
		
		
		
		
		
	}
}
