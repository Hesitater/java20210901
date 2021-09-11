package p10excetion.p03lecture.p04multiple_exception;

public class Example4Multiple {
	public static void main(String[] args) {
		
		String[] arr = {"1", "a"};
		
		try {
			int n =Integer.parseInt(arr[2]);
		} catch (ArrayIndexOutOfBoundsException e) { // exception의 하위 개념이라 쓸모없는 코드가 됨
			System.out.println("익셉션 발생");
		} catch ( Exception e) {
			System.out.println("인덱스 오버");   
		}
		
		System.out.println("프로그램 종료");
	}
}
