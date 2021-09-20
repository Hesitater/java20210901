package p11api.p04wrapper;

public class Ex01 {
	public static void main(String[] args) {
		// 기본 타입: byte, short, int, long, float, double, boolean , char
		// 참조타입 : Byte, Short, Integer, Long, Float, Double, Boolean, Character

		// 기본 타입 ---> 참조 타입 (wrapping, boxing) 한다
		int i1 = 300;
		Integer i2 = new Integer(i1);		 // wrap -> boxing 생성자를 사용해서(래핑해서)

		long l1 = 2971034719873429837L;
		Long l2 = new Long(l1);

		byte b1 = 100;
		Byte b2 = new Byte(b1);

		short s1 = 20000;
		Short s2 = new Short(s1);

		float f1 = 3.14F;
		Float f2 = new Float(f1);

		double d1 = 3.14;
		Double d2 = new Double(d1);

		boolean n1 = true;
		Boolean n2 = new Boolean(n1);

		char c1 = 'a';
		Character c2 = new Character(c1);

	}
}
