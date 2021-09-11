package p08interface.p01textbook.p03lecture.p01abstract_method;

public interface Pet {
	
	  //인터페이스는 객체를 만들 수 없다. (추상 클래스는 객체를 만들 수 없다)
	  // 인터페이스로는 인스턴스를 만들 수 없다.
	  // 몸통을 가질 수 없고	 앉아(추상메서드) 라는 기능 만 존재 
	
	
// 		인터페이스의 메소드는  추상(abstract) 메소드, 그리고 public
//		public abstract void sit();  아래3개 같은 코드
//		public void sit();
		void sit();
	
}
