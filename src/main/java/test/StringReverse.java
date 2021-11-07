package test;

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
		
		
		
		
		
	}
	
	//reverse number
	 public static int reverseNum(int number)
	    {
	        int reverse = 0;
	        int remainder = 0;
	        do {
	            remainder = number % 10;
	            reverse = reverse * 10 + remainder;
	            number = number / 10;
	 
	        } while (number > 0);
	        return reverse;
	    }

}
