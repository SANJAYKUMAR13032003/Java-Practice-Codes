package Basics;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//ODD or EVEN
		System.out.println("Enter the Upto numbers to check odd or even : ");
		int uptoNum = sc.nextInt();
		int i = 1;
		
		while(i<=uptoNum) {
			if(i%2==0) {
				System.out.println(i + " is Even number");
			}
			else {
				System.out.println(i+" is Odd number");
			}
			i++;
		}
	}
}