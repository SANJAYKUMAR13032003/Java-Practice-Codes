package Basics;

import java.util.*;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		
		if(age<18) {
			System.out.println("Your age is less than 18, So You are not Eligible");
		}
		
		else if(age > 60) {
			System.out.println("Your age is Greater than 60, So You are not Eligible");
		}
		
		else {
			System.out.println("Your are Eligible");
		}
	}

}
