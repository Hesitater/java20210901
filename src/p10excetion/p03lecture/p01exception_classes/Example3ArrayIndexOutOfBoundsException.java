package p10excetion.p03lecture.p01exception_classes;

public class Example3ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		int[] arr = {3, 1, 6};						//3번 인덱스 없음
		
		for (int i = 0; i <= arr.length; i++) {		//3번인덱스
			System.out.println(arr[i]);
		}
		
		System.out.println("프로그램 종료");
		
		//3번 인덱스를 참조하는 순간 java.lang.ArrayIndexOutOfBoundsException: 3 발생
		
	}
}
