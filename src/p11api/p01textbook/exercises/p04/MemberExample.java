package p11api.p01textbook.exercises.p04;

public class MemberExample {  //교재 568쪽 확인문제 4
	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		System.out.println(member);					//blue: 이파란
		System.out.println(member.toString());		
		System.out.println(String.valueOf(member));
		
		//println 에 String.valueOf(object) 가있음 
		//valueOf(object)는 object가 null값이 아니면 문자열 출력 
		
	}
}
