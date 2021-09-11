package p08interface.p01textbook.p03lecture.p02default_method;

public interface Pet {

	void sit();
//	void roll();       를 추가하고싶은데 하 너무 많네 ;
	default void roll() {   			// 항상 public   public default void roll() {
		System.out.println("구릅니다.");
	}
	
	
}
