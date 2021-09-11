package p08interface.p01textbook.p01textbook;

public interface RemoteControl {

	//상수
	int MAX_VOLUME = 10;		// public static final
	int MIN_VOLUME = 0;			// public static final
	
	//추상 메서드
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	
//	void setMute(boolean mute);  이렇게하면 Audio,SmartTelevision , Television 에  다 메서드 정의해야되
	
	
	
	//디폴트 메소드					//Audio,SmartTelevision , Television에서 setMute 메서드기능을 정의 안해도 사용가능
	default void setMute( boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	public static void changeBatter() {				//정적메소드(static method)
		System.out.println("건전지를 교환합니다.");
	}
	
	
	
}
