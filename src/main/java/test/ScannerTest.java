package test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Initialize sum and count of input elements 
		int sum = 0, count = 0;
		
		System.out.println("Please input integer number: ");

		// Check if an int value is available 
		 while (sc.hasNextInt())
		 {
		
		// String input : sc.nextLine();
		// Character input : sc.next().charAt(0);
		// Read an int value: sc.nextInt(); sc.nextLong(); sc.nextDouble();
		int num = sc.nextInt();
		sum += num;
		count++;
		}
		// encountered EOF, for instance, input character to end the loop in this case as 
		sc.close();
		int mean = sum/count;
		System.out.println("Sum: " + sum);
		System.out.println("Count: " + count);
		System.out.println("Mean: " + mean);

	}

}
