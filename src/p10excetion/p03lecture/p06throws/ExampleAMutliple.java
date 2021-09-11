package p10excetion.p03lecture.p06throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleAMutliple {
	public static void main(String[] args)  {
		try {			//각각 try catch 로 잡는다.
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {			// 멀티 캐치
			method1();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		try {			//상위 개념으로 잡는다.
			method1();
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException, FileNotFoundException, IOException {
		Class.forName("");
		
		FileReader fr = new FileReader("");
		
		fr.close();
	}
}
