package p11api.p04wrapper;

public class Ex05 {
	public static void main(String[] args) {
		int i1 = 300; // 4byte
		Integer i2 = 300; // auto unboxing

//		i1 = null;   // 기본타입은 null 값을 못가짐
		i2 = null; // 참조타입이라 null값 가질 수 있다.

		short s1 = 100; // 2byte
		Short s2 = 100;

		i1 = s1; // 기본타입은 형변환 가능
//		i2 = s2;	// interface, 상속 관계 때문에 short는 int라고 할 수 없다
//		i2 = (Integer) s2;     // 개를 고양이로 바꿀 수 없다

		i2 = s2.intValue(); // 자동 언방식 해줌 Value가 있는 것들은

		int i3 = i2 + 100;  // 참조타입은 바로 연산 같은게 안되는데 auto unboxing으로 인하여 연산 가능하게 해줌
		System.out.println(i3);		//200 나옴

		Object o1 = i2; // 다형성 떄문에 Int 는 Object이니깐
		i2 = (Integer) o1;

	}
}
