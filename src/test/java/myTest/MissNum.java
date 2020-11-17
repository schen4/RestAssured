package myTest;

public class MissNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculate A = n (n+1)/2 where n is largest number in series 1…N.
		//Calculate B = Sum of all numbers in given series
		//Missing number = A – B
		
		int[] numbers = {1,2,3,4,5,7,8,9,10,11,12};
		
		int N = 12;
		int idealSum = N*(N+1)/2 ;
		int Sum = calculateSum(numbers);
		
		int missingNum = idealSum - Sum;
		
		System.out.println("Missing number is:" + missingNum);
				
		
	}
	
	private static int calculateSum(int[] nums) {
		int sum = 0;
		
		for(int n : nums) {
			sum += n;
		}
		return sum;
		
	}

}
