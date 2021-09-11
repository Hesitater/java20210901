package p10excetion.p03lecture.p04multiple_exception;

public class Example5Multiple {
	public static void main(String[] args) {
		String[] arr = {"1", "a"};
		
		try {
			int i = Integer.parseInt(arr[1]);
			System.out.println("정상 출력");			//arr[0] 이면 출력되겠죠?
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("익셉션 발생");
		}											// |를 이용한 처리방법
		
	}
}
