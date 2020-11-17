package myTest;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Initialize sum and count of input elements 
		int sum = 0, count = 0;

		// Check if an int value is available 
		 while (sc.hasNextInt())
		 {
		// Read an int value 
		int num = sc.nextInt();
		sum += num;
		count++;
		}
		sc.close();
		int mean = sum / count;
		System.out.println("Mean: " + mean);

	}

}
