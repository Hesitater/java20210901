package p10excetion.p03lecture.p05throw;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example8 {
	public static void main(String[] args)  {
		
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				// 오류가 났을떄 오류가 안나도록 해봅시다
	}
}
