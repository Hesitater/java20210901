package p10excetion.p03lecture.p04multiple_exception;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String[] arr = {"3", "4", "a"};
		
		try {
			int n = Integer.parseInt(arr[3]);		// arr[] 에 숫자 넣어가며 확인
			System.out.println(n);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스아읏오브바운즈익셉션 발생");
		} catch (NumberFormatException e) {
			System.out.println("넘버 포맷익셉션 발생");
		}
		
		System.out.println("프로그램 종료");
		
	}
}
