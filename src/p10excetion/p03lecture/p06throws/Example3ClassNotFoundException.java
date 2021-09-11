package p10excetion.p03lecture.p06throws;

public class Example3ClassNotFoundException {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("aaaa");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
