package p07extends.p01textbook.s070705;

public class ChildExample {
	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		parent.method1();
		parent.method2();
		
		// child 변수 선언, 적절한 값 할당 
		
		Child c1 = (Child) parent;  //parent 를 method3을쓰기위해 강제 형변환
//		Child child = new Child();   //이것도 가능 
		
		
		c1.method3();		// 부모한테 없는 method3을  강제 형변환 받아서 사용가능
		c1.method1();		// 
		c1.method2();
		
		
		
	}
}
