package p12thread.p03lecture.p01thread;

import java.awt.Toolkit;

public class Ex04 {
	public static void main(String[] args) {
		Thread t1 = new NumberThread();
		Thread t2 = new BeepThread();
											//실행하면 숫자랑 소리랑 동시에 나옴
		t1.start();
		t2.start();
		
	}
}

class NumberThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1000milli second 만큼 멈추기 sleep 쓰레드를 잠깐 멈출수 있게 해주는
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 소리가나는
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}