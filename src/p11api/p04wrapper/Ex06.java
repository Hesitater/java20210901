package p11api.p04wrapper;

public class Ex06 {
	public static void main(String[] args) {
		// 내가 쓰는게 기본타입인지 참조 타입인지 아는것이 중요함
		
		int i1 = 1000;
		int i2 = 1000;
		
		System.out.println(i1 == i2);

		Integer i3 = new Integer(1000);
		Integer i4 = new Integer(1000);
		
		System.out.println(i3 == i4); 			// i3,i4는 새로운 인스턴스 이니깐  false 나옴
		System.out.println(i3.equals(i4));      // 비교하려면 equals 를 쓰던가
		
		System.out.println(i3.intValue() == i4.intValue());  // 기본타입으로 형변환해서 값을 비교하던가
	
	}
}
