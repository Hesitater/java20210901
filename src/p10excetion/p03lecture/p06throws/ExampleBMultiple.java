package p10excetion.p03lecture.p06throws;

import java.io.FileReader;
import java.io.IOException;

public class ExampleBMultiple {
	public static void main(String[] args) throws Exception {
		method1();
		
	}
									
	public static void method1() throws ClassNotFoundException,  IOException {
		Class.forName("");
		
		FileReader fr = new FileReader("");
		
		fr.close();
	}
}
