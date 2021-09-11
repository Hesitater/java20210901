package p10excetion.p03lecture.p05throw;

public class Example1ThrowRuntimeException {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		// RuntimeException을 상속 받은 Exception은
		// try/catch를 사용해도 되고 안해도 됨
		
		NullPointerException e = new NullPointerException();
		
		throw e;   // 누군가 던졋기 때문에 캐치할수 있었다?
		
//		System.out.println("프로그램 종료");
	}
}
