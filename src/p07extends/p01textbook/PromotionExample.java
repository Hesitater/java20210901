package p07extends.p01textbook;

class A {}

class B extends A {} //B는 A다
class C extends A {} // C is a A.

class D extends B {} // D는 B이다 D는 A이다
class E extends C {} // E는 C이다 E는 A이다



public class PromotionExample {	

	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	B b1 = b;
	C c1 = e;
	
//	B b3 = e;	//컴파일 에러( 상속관계에있지 않음
//	C c2 = d;
	
	
	//교재 308쪽
	
}
