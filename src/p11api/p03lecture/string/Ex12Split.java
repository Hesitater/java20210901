package p11api.p03lecture.string;

public class Ex12Split {
	public static void main(String[] args) {
		String s1 = "java,html,css,spring,isp";

		String[] arr1 = s1.split(","); // 구분하고 싶은걸로

		for (String item : arr1) {
			System.out.println(item);
		}
		
			System.out.println("===========================================");
			
			String str2 = "java spring html  css";		//html와 css사이에만 띄어쓰기2칸
			String[] arr2 = str2.split(" ");			// 빈스트링이 하나의 문자가됨
			
			for (String item : arr2) {
				System.out.println(item);
			}
			
			System.out.println(arr2.length);
			
			System.out.println("===========================================");
			
			String str3 = "java spring html  css";		//html와 css에사이에만 띄어쓰기2칸
			String[] arr3 = str3.split(" +");			//space+ 2개의 문자로 이루어져있음
														// space가 한개이상 나타나는걸 구분자로 하겠다.
			for(String item : arr3) {
				System.out.println(item);
			}
			
		
	}
}
