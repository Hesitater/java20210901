package p12thread.p03lecture.p01thread;

public class Ex01 {
	public static void main(String[] args) {
		OtherThread t1 = new OtherThread();
		t1.start(); // 실행해야하는 메소드
					// Thread에 start 메소드가 정의 되어 있음
					// start 실행시 적절한 순간에 run메소드가 실행됨

		System.out.println("프로그램 시작");

		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}

		System.out.println("프로그램 종료");

	}
}

// Thread 클래스 활용

class OtherThread extends Thread {

	@Override
	public void run() { // 우리가 재정의해야 하는 메소드
		System.out.println("다른 스레드 시작");
		for (int i = 10000_0000; i < 10001_0000; i++) { // _는 자리수 확인용
			System.out.println(i);
		}
		System.out.println("다른 스레드 종료");
	}

}