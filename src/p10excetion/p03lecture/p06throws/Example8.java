package p10excetion.p03lecture.p06throws;

import java.io.IOException;

public class Example8 {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		
		try {
			method2();	
//		} catch (IOException e) {		// 다형성떄문에 Exception 은 IOexception이 아니기 떄문이다.
		} catch (Exception e) {			// 명시된 클래스 보다 하위 클래스를 사용 할 수 없다.	
//			e.printStackTrace();
			System.out.println(e instanceof Exception);
			System.out.println(e instanceof IOException);
		}
		
	}
	
	public static void method1() throws IOException {
		throw new IOException();
	}
	
	public static void method2() throws Exception {
		throw new IOException();
	}
}
