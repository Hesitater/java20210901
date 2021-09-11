package p08interface.p01textbook.p01textbook;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {			//Searchable의 추상 메소드에 대한 실체 메소드
		System.out.println(url + "를 검색합니다");
	}

	@Override
	public void turnOn() {						//RemoteControl의 추상 메소드에 대한 실체 메소드
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
