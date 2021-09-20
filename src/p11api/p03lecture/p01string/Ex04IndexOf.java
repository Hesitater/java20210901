package p11api.p03lecture.p01string;

public class Ex04IndexOf {
	public static void main(String[] args) {
		String s1 = "spring";   // spring index 0~5까지  배열과 유사
		//index      012345
		
		System.out.println(s1.length());		//길이
		System.out.println(s1.indexOf("ring"));  //index번호2부터 나옴
		
		System.out.println(s1.indexOf("sp"));   // 어디에서 나오나
		System.out.println(s1.indexOf("ps"));	//   못찾으면 -1
		
		String s2 ="java보다 javascript가 더 쉬웠어요";
		System.out.println(s2.indexOf("script"));		// 11
		System.out.println(s2.indexOf("java"));		
		// 같은거 있을시 첫번째꺼 찾아줌 근데 설명에 나와있음
		
		
	}
}
