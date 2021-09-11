package p10excetion.p01textbook.exercise.p7;

public class NotExistIdException extends Exception {
		// 일반예외 (checked exception)
	public NotExistIdException() {
		
	}
	
	public NotExistIdException(String message) {
		super(message);			// 보통 Exception이 사용하는걸 사용하게 한다
	}							// 채워 넣어야할곳
}
