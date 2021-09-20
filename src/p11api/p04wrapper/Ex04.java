package p11api.p04wrapper;

public class Ex04 {
	public static void main(String[] args) {
		//auto unboxing
		Integer i1 = new Integer(300);
		int i2 = i1.intValue();			//unboxing
		int i3 = i1;				// auto unboxing
		
		Short s1 = new Short((short) 500);
		short s2 = s1.shortValue();
		short s3 = s1;
		
		Long l1 = new Long(123456789L);
		long l2 = l1.longValue();
		long l3 = l1;
		
		Byte b1 = new Byte((byte)100);
		byte b2 = b1.byteValue();
		byte b3 = b1;
		
		Float f1 = new Float(3.14F);
		float f2 = f1.floatValue();
		float f3 = f1;
		
		Double d1 = new Double(3.14);
		double d2 = d1.doubleValue();
		double d3 = d1;
		
		Boolean n1 = new Boolean(true);
		boolean n2 = n1.booleanValue();
		boolean n3 = n1;
		
		Character c1 = new Character('a');
		char c2 = c1.charValue();
		char c3 = c1;
				
		
	}
}
