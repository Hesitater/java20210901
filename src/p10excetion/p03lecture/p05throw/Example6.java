package p10excetion.p03lecture.p05throw;

public class Example6 {
	public static void main(String[] args) {
		// ClassCastException 발생 시키는 코드
		// RuntimeException 의 속함
		Object o = "java";
		
		String s = (String) o;				
		Number n = (Number) o;				// String Number 관계가 없음
		
		System.out.println("프로그램 종료");
		
		throw new ClassCastException();			//throw 키워드를 이용하여
		
//		ClassCastException cce = new ClassCastException();
//		throw cce;
	}
}
