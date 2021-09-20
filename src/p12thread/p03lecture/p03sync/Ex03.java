package p12thread.p03lecture.p03sync;

public class Ex03 {
	public static int v= 0;
	public static Object o = new Object();
	
	public static void main(String[] args) {
		Runnable r= new Runnable() {
			
			@Override
			public void run() {
				for( int i = 0; i< 100000; i++) {
					synchronized (o) {		// () 안에 객체가 바톤 역할을 하게 된다
						v ++;				// 혹은 회의에서 발언권 역할
					}
				}
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(v);
		
	}
}
