package p08interface.p01textbook.p01textbook;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		
		Searchable s1 = new SmartTelevision();
		s1.search("naver");
		
		RemoteControl r1 = new SmartTelevision();
		r1.turnOn();
		r1.turnOff();
		
		
		System.out.println(r1 instanceof SmartTelevision);	
		System.out.println(r1 instanceof RemoteControl);	// 인터페이스 받으니깐
		System.out.println(r1 instanceof Searchable);		// 인터페이스 받으니깐
		
		
		//강제 형변환 가능
		Searchable s2 = (Searchable) r1;			//ok
		SmartTelevision t1 = (SmartTelevision) r1;	//ok
		
		
		
		
		
		
	}
}
