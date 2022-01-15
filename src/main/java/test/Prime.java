package test;

public class Prime {
	
	// prime - 质数，除1和本身能被整除
	public static boolean isPrime(int n) {
		boolean flag = true;
		for(int i=2; i < n; i++) {
			if(n%i == 0) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		if(isPrime(n)) {
			System.out.println( n + " is Prime!");
		}
		else {
			System.out.println( n + " is not Prime!");
		}
		
		
	}

}
