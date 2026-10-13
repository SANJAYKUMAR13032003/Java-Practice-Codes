package Basics;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers to print: ");
		int num = sc.nextInt();
		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=num);

	}

}
