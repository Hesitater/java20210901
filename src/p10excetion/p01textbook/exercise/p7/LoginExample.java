package p10excetion.p01textbook.exercise.p7;

public class LoginExample {
	public static void main(String[] args) {
		
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void login(String id, String password ) throws WrongPasswordException,NotExistIdException  { //채울곳  {
		
		//id가 "blue" 가 아니라면 NotExistIDException 발생시킴
		if( !id.equals("blue")) {
			throw new NotExistIdException("이이디가 존재하지 않습니다");		// 채워 넣어야할곳
		}
		
		//password가 "!2345"가 아니라면 WrongPasswordException 발생시킴
		if( !password.equals("!2345")) {
			throw new WrongPasswordException("패스워드가 틀립니다");   			//채워 넣어야할곳 
		}
		
	}
}
