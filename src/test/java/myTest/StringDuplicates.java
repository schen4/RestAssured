package myTest;

import java.util.HashMap;

public class StringDuplicates{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testStr = "safdjowe   iasfa";
		
		//convert string to char array
		char[] chars = testStr.toCharArray();
		
		//define HashMap to store the result of duplication
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c: chars) {
			if(map.containsKey(c)) {
				int counter = map.get(c);
				map.put(c, ++counter);
			}
			else {
				map.put(c, 1);
			}
		}
		
		System.out.println("Duplicate characters are:");
		
		//print the duplicate characters
		for(char c: map.keySet()) {
			if(map.get(c) > 1) {
				System.out.println(c);
			}
		}
		
		//Duplicate characters excluding the white space
		System.out.println("Duplicate characters excluding white space");
		
		for(char c : map.keySet()) {
			if(map.get(c)>1 && !Character.isWhitespace(c)) {
				System.out.println(c);
			}
		}

		//print the distinct characters
		System.out.println("Distinct characters");
		for(char c : map.keySet()) {
			if(map.get(c) == 1) {
				System.out.println(c);
			}
		}
	}

}
