package p10excetion.p03lecture.p05throw;

public class Example3 {
	public static void main(String[] args) {
		// 일반 예외( checked exception)
		// Exception 중 RuntimeException을 상속 받지 않은 것

		try {
			throw new Exception(); // Example2에서 2줄을 한줄로
		} catch (Exception e) {
			System.out.println("익셉션 발생");
		}

		// 실행 예외 (unchecked exception)
		// Exception 중 RuntimeException 상속 받은 것

		throw new RuntimeException(); // try/catch 안써도됨 컴파일 오류 안뜸

	}
}
