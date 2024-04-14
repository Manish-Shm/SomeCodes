package com.recursion;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter the number upto which you  have to print the series");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		System.out.println("Here is your fibonacci series");
		printFibonacci(num);
		sc.close();
	}
	
	public static void printFibonacci(int num) {
		int first =0, second=1;
			if(num<0) return;
			System.out.print("0 ");
			
			if(num==0) return;
			System.out.print("1 ");
			
			while(first+second <= num ) {
				int third = first + second ;
				System.out.print(third + " ");
				first = second;
				second =third;
				
			}
	}
}
