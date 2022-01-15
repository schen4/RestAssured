package test;

public class CountNegativeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 3, -2, -5, 8, -9, 10, 23};
		
		int count = 0;
		
		for(int i : nums) {
			if(i<0) count++;
		}
		
		System.out.println("The count of the negative number is: " +count);
	}

}
