package p10excetion.p03lecture.p02try_catch;

public class Example2TryCatch {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");						//1번쨰
		
		String str = "1ㅁㅁㅁㅁㅁㅁ00";								//2번쨰
		
		
		try {
			//exception 발생하면 try 블런안의 다음 명령문 실행안함
			int n1 = Integer.parseInt(str);							//3번쨰
			System.out.println(n1 * 2);								
		} catch (NumberFormatException e) {
			System.out.println("넘버포멧익셉션 발생");				//4번째
		}
		
		System.out.println("프로그램 종료");						//5번쨰
	}
}
