package p10excetion.p01textbook.exercise.p7;

public class WrongPasswordException extends Exception {
		// 일반예외 (checked exception)
	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
			super(message);			// 채워 넣어야할곳
	}
	
	public WrongPasswordException( Throwable cause) {    //원인을 보게해주는 
			super(cause);
	}
}
