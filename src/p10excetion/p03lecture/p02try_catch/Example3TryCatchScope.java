package p10excetion.p03lecture.p02try_catch;

public class Example3TryCatchScope {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String str = "100";
		
		int n = 0;
		
		try {
			 n = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 발생");
		}
		
		System.out.println(n * 2); 				//이거 밖에서 쓰고싶어서 int n을 밖에 설정
		
		System.out.println("프로그램 종료");
	}
}
