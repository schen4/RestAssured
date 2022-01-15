package test;

public class IntegerReverse {

	public static int reverse(int num) {
		//The int data type can store whole numbers from -2147483648 to 2147483647
		//consider the reverse number could be overflow
		int rev = 0;
		while(num != 0) {
			int remainder = num%10;
			num = num/10;
			if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && remainder > Integer.MAX_VALUE%10)) return 0;
			if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && remainder < Integer.MIN_VALUE%10)) return 0;
			rev = rev*10 + remainder;
		}
		return rev;
	}
	
	public static int intReverse(int x) {
		String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
		try {
			return (x <0)? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
		}catch(NumberFormatException e) {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		int x = -2345; 
		System.out.println("Reversed number is: " + intReverse(x));
		System.out.println("Reversed number is: " + reverse(x));
	}
}
