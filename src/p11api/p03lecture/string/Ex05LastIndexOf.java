package p11api.p03lecture.string;

public class Ex05LastIndexOf {
	public static void main(String[] args) {
		//LastIndexOf
		
		String s1 = "java보다 javascript가 더 쉬웠어요";
//					 01234 5 67890123456   
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java"));
		System.out.println(s1.lastIndexOf("python"));  // 이것도 못찾으면 -1
	}
}
