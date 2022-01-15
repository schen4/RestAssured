package test;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// reverse string 
		String str = "Hello!";
		StringBuilder reverse = new StringBuilder(str).reverse();
		
		System.out.println("Original string:" + str);
		System.out.println("Reverse string:" + reverse);
		
		//reverse string by words
		String str2 = "Java objected oriented programing";
		
		StringBuilder reverStr = new StringBuilder();
		
		//Put words from string in Stack
		Stack<String> myStack = new Stack<String>();
		
		
		StringTokenizer tokenizer = new StringTokenizer(str2, " ");
		
		while(tokenizer.hasMoreTokens()) {
			myStack.push(tokenizer.nextToken());
		}
		
		//Pop each word from stack and append in string builder
		while(!myStack.isEmpty()) {
			reverStr.append(myStack.pop()+ " ");
		}
		
		System.out.println(reverStr.toString());
		
		
		System.out.println("Palindrome?" + isPalindrome("aabbaa"));		
		
	}
	
	
	public static boolean isPalindrome(String input) {
		
		String reversed = "";
		
		int len = input.length()-1;
		
		for(int i = 0; i< input.length(); i++) {
			reversed = reversed + input.charAt(len-i);
		}
		
		
		System.out.println("Reversed string is: " + reversed);
		
		if(reversed.equals(input)) {
			return true;
		}else return false;
	}
	
	
}
