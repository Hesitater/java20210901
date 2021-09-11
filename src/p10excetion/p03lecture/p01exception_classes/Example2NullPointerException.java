package p10excetion.p03lecture.p01exception_classes;

public class Example2NullPointerException {
	public static void main(String[] args) {
		System.out.println("포로그램 시작");			//1번째
		
		Object o1 = null;								//2번쨰
		method(o1);
		
		System.out.println("프로그램 정상 종료");		//4번쨰
	}
	
	public static void method(Object o) {
		o.hashCode();									//3번쨰 NullPonterException 일어남
	}
	
}
