package p08interface.p01textbook.p01textbook.s080302;

import p08interface.p01textbook.p01textbook.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc;
		
//		rc = new RemoteControl(); // x  인터페이스로는 인스턴스(객체) 를 만들수 없으니깐
		
		rc = new RemoteControl() { //첨에 빨간줄뜨는데 RemoteControl에 메서드 재정의를 해야됨

			@Override
			public void turnOn() {
				System.out.println("인터페이스로 인스턴스 객체만들수없으니깐");
			}

			@Override
			public void turnOff() {
				System.out.println("{} 이용 interface 클래스도 만들고 인스턴스도 만들고  ");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("인터페이스 메서드 재정의 한다는거");
			}
		
		};
	}
}
