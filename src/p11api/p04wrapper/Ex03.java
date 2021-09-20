package p11api.p04wrapper;

public class Ex03 {
	public static void main(String[] args) {
		// unboxing
		
		Integer i1 = new Integer(300);
		int i2 = i1.intValue();      // ~~Value 메소드로 참조 -> 기본 리턴 받는거
		
		Short s1 = new Short((short)10013);			// 자바 리터럴을 int로 인식해서 short로 강제형변환
		short s2 = s1.shortValue();
		
		Long l1 = new Long(123456789L);
		long l2 = l1.longValue();
		
		Byte b1 = new Byte((byte) 11);
		byte b2 = b1.byteValue();
		
		Float f1 = new Float(3.14F);
		float f2 = f1.floatValue();
		
		Double d1 = new Double(3.14);
		double d2 = d1.doubleValue();
		
		Boolean n1 = new Boolean(true);
		boolean n2 = n1.booleanValue();
		
		Character c1 = new Character('c');
		char c2= c1.charValue();		
		
		
	}
}
