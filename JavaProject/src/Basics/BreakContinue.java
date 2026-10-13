package Basics;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		
		while(i<1) {
				System.out.println("Enter the numbers to add only even numbers \nIf Enter 999, it will terminate");
				int a = sc.nextInt();
				if(a==999) {
					break;
				}
				else if(a%2!=0) {
					continue;
				}
				else {
					sum += a;
				}
			}
		System.out.println("Final Sum value = "+sum);
		}
}
