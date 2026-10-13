package Basics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number A & B : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter the Number to perform respective operation:\n1=> '+'\n2=> '-' \n3=> '*' \n4=> '/' \n5=> '%' ");
		char option = sc.next().charAt(0);
		
		switch(option) {
		
		 case '1' : {
			 System.out.println("A + B = "+(a+b));
		 }
		 
		 case '2' : {
			 System.out.println("A - B = "+(a-b));
		 }
		 
		 case '3' : {
			 System.out.println("A * B = "+(a*b));
		 }
		 
		 
		 case '4' : {
			 System.out.println("A / B = "+(a/b));
		 }
		 
		 case '5' : {
			System.out.println("A % B = "+(a%b));
		 }
		 
		 default:{
			 System.out.println("Bye !...");
		 }
		}
	}

}
