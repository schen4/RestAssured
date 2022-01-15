package test;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionMarks {
	
	//function to check if there are exactly 3 question marks between every pair of two numbers that add up to 10
	
	public static boolean isRequiredQuestionMarks(String str) {
		boolean result = false;
		String numMarks = str.replaceAll("[^0-9?]", "");
		String pattern = "(\\d\\?+\\d)";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(numMarks);
		
		while(m.find()) {
			String temp = m.group();
			int a = Integer.parseInt(temp.substring(0,1));
			int b = Integer.parseInt(temp.substring(temp.length()-1));
			
			if( (a+b) == 10) {
				if(temp.length() ==5) result = true;
			}
		}
		
		return result;
	}
	
	public static boolean userNameValidation(String str) {
//		1. The username is between 4 and 25 characters.
//		2. It must start with a letter.
//		3. It can only contain letters, numbers, and the underscore character.
//		4. It cannot end with an underscore character.
		// "\w" 匹配任何字类字符，包括下划线。与"[A-Za-z0-9_]"等效。
		// "{n,m}" 匹配至少 n 次，至多 m 次。
		
		Pattern p = Pattern.compile("[a-zA-Z][\\w]{2,23}[^_]");
		Matcher m = p.matcher(str);

		return m.matches();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String testStr = "arrb6???4xxbl5???eee5";
		
		System.out.println(isRequiredQuestionMarks(testStr));

	}

}
