package test;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(12);
		System.out.println(result);
		

	}

// return sum of 6+5+4+3+2+1	
	public static int sum(int k) {
		if(k>0) {
			return k + sum(k-1); //making a function call itself
		}
		else {
			return 0; //Halting condition
		}
	}
	
//First Factorial:
	// for example: if num = 4,  should return(4*3*2*1)=24
	
	
	public static int FirstFactorial(int num) {
		
		if(num !=1) {
			return num*FirstFactorial(num-1);
		}
		
		return num;
	}

}
