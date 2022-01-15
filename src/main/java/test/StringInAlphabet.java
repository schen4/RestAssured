package test;

import java.util.HashMap;

public class StringInAlphabet {

	public static boolean isStringOnlyAlphabet(String str) 
	{ 
	return ((!str.equals("")) 
	&& (str != null) 
	&& (str.matches("^[a-zA-Z]*$"))); 
	} 
	
	public static boolean isValid(String s) {
		//validate the open bracket and close bracket are same type of brackets and must be closed in the correct order
		boolean result = false;
		
		 HashMap<Character,Character> map = new HashMap<>();
	        
	        map.put('(',')');
	        map.put('{','}');
	        map.put('[',']');
	        
	        for(int i=0; i<s.length(); i = i+2){
	        	
	        	if(map.containsKey(s.charAt(i))) {
	        		if (map.get(s.charAt(i)) == s.charAt(i+1)) result = true ;
	        	}
	               
	        }
	        
	   return result;
	}
	
	
	public static void main(String[] args) {
		
		String testStr = "[)";
		
		System.out.print(isValid(testStr));
		
	}
}
