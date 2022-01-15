package test;

public class Palindrome {

	// An integer is a palindrome when it reads the same backwards as forwards
	public static boolean isPalindrome(int num) {
		boolean flag = false;
		// num < 0 or last digit is 0, num is not palindrome
		if(num <0 || (num %10 ==0 && num !=0)) {
			flag = false;
		}
		else {
			int reverseNum = 0;
			while(num > reverseNum) {
				reverseNum = reverseNum* 10 + num%10 ;
				num = num/10;
			}
			// When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
	        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
	        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
			if(num == reverseNum || num == reverseNum/10) flag = true;
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		int x = 11211;
		System.out.println(isPalindrome(x));
	}
}
