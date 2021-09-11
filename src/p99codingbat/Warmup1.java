package p99codingbat;

public class Warmup1 {

	public boolean stringE(String str) {
		
		//내답 1
//		return java.util.regex.Pattern.matches("[^e]*e?e[^e]*e?|[^e]*e?ee(^e)*e?|[^e]*eee[^e]*",str);
			
		
		
			//내가 나눠본것
//		 return java.util.regex.Pattern.matches("[^e]*e[^e]*",str)
//			    || java.util.regex.Pattern.matches("[^e]*ee[^e]*e?",str)
//			    || java.util.regex.Pattern.matches("[^e]*eee[^e]*", str);
		
		// 선생님꺼 + switch문
		// int count = 0;
	    // boolean s = false;    
	    
	    // for (int i = 0; i< str.length(); i++) {
	    //     if(str.charAt(i) == 'e') {
	    //       count++;
	    //     }      
	    // }
	    
	    //   switch(count) {
	    //     case 1:
	    //       s = true;
	    //       break;
	    //     case 2:
	    //       s = true;
	    //       break;
	    //     case 3:
	    //       s = true;
	    //       break;
	    //     default :
	    //       s = false;
	    //   }
	    //   return s;
		
		
		
		// return java.util.regex.Pattern.matches("[^e]*e[^e]*e?[^e]*e?[^e]*", str); 선생님답1
		
		// 선생님답 2
		  int count = 0;
		  
		  for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i) == 'e') {
		      count++;
		    }
		  }
		  
		  return count >= 1 && count <= 3;
	}
	
	
	
	public boolean mixStart(String str) {
	    
        // return java.util.regex.Pattern.matches("\\wix.*",str);    
    // return java.util.regex.Pattern.matches(".ix.*",str);
    
    // for ( int i = 0; i <str.length() -2; i++) {
        
    //     String sub = str.substring(i , i+3);
        
    //     if(sub.charAt(1) == 'i' && sub.charAt(2) == 'x' )
    //     return true;
    //   }
    //     return false;
    
    if( str. length() >= 3) {
      String sub = str.substring(1, 3);
      return sub.equals("ix");
    }
    return false;    
}

	
	public String notString2(String str) {
		if (str.startsWith("not")) {
			return str;
		}

		return "not " + str;
	}

	public String notString(String str) {
		int len = str.length();

		if (len >= 3) {
			char c1 = str.charAt(0);
			char c2 = str.charAt(1);
			char c3 = str.charAt(2);

			if (c1 == 'n' && c2 == 'o' && c3 == 't') {
				return str;
			}
		}

		return "not " + str;
	}

	public boolean makes10(int a, int b) {
		if (a == 10) {
			return true;
		}

		if (b == 10) {
			return true;
		}

		if ((a + b) == 10) {
			return true;
		}

		return false;
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public int diff21(int n) {
		if (n > 21) {
			return (n - 21) * 2;
		} else {
			return 21 - n;
		}
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		/*
		 * boolean result = !weekday || vacation;
		 * 
		 * return result;
		 */

		return !weekday || vacation;

	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		return aSmile == bSmile;
	}

	public int sumDouble(int a, int b) {

		if (a != b) {
			return a + b;
		} else {
			return (a + b) * 2;
		}

	}

}
