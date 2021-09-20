package p11api.p04wrapper;

public class Ex02 {
	public static void main(String[] args) {
		// boxing
		int i1 = 300;
		Integer i2 = new Integer(i1);
		
		// auto boxing			많이쓰여서 자바안에서 자동으로 래핑,박싱하게 끔
		int i3 = 500;
		Integer i4 = i3;
		Integer i5 = 700;       // 기본 타입에 바로 넣을 수 있다(자동 박싱,래핑)
		
		byte b1 = 100;
		Byte b2 = b1;
		Byte b3 = 100;
		
		long l1 = 12345678912L;
		Long l2 = l1;
		Long l3 = 12345678912L;
		
		short s1 = 12345;
		Short s2 = s1;
		Short s3 = 12345;
		
		float f1 = 3.14F;
		Float f2 = f1;
		Float f3 = 3.14F;
		
		double d1 = 3.14;
		Double d2 = d1;
		Double d3 = 3.14;
		
		boolean n1 = true;
		Boolean n2 = n1;
		
		char c1 = 'a';
		Character c2 = c1;
		Character c3 = 'a';
		
		
//		Integer i6 = 300;
//		System.out.println(i6 + 100);		// auto unboxing
		
		
		
	}
}
