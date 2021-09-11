package p10excetion.p03lecture.p05throw;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example9 {
	public static void main(String[] args) throws IOException {
		method1();
	}
	
	public static void method1() throws IOException {
		method2();
	}
	
	public static void method2() throws IOException {
		method3();
	}
	
	public static void method3() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
	
		is.close();							//method3()에서 익셉션이 생겼을때 어떻게 해야하
	}
	
}
