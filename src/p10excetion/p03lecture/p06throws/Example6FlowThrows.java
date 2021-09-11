package p10excetion.p03lecture.p06throws;

public class Example6FlowThrows {
	public static void main(String[] args) throws Exception {
		System.out.println("프로그램 시작");
		
		method1();
		
		System.out.println("프로그램 종료");
	}
	
	public static void method1() throws Exception {
		throw new Exception();
	}
}
