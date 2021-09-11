package p10excetion.p03lecture.p06throws;

import java.io.IOException;

public class Example7Casting {
	public static void main(String[] args) {
		// try catch
		
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {				//( Exception e) 도 가능
			System.out.println("익셉션 발생");
		}
	}
	
//	public static void method1() throws Exception {  다형성 때문에 가능
	public static void method1() throws IOException {
		throw new IOException();
	}
}
