package p10excetion.p03lecture.p05throw;

public class Example5 {
	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		String[] arr = { "1", "2"};
		
		System.out.println(arr[-1]);			//1번째 없는 인덱스넣음
		
		throw new ArrayIndexOutOfBoundsException(); // 2번째 throw 키워드 넣음
		
//		int n =Integer.parseInt(arr[3]);
//		System.out.println(n);
	}
}
