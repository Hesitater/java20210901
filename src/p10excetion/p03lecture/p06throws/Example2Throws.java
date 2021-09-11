package p10excetion.p03lecture.p06throws;

import java.io.FileNotFoundException;

public class Example2Throws {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (FileNotFoundException e) {
			System.out.println("파일 못찾음..ㅠ");
		}
	}
	
	public static void method1() throws FileNotFoundException {			//메서드에 익셉션이 생긴상태
		
		throw new FileNotFoundException();
	}
}
