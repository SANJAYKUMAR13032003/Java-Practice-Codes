package Basics;

import java.util.*;
public class GetUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the one Integer \nEnter one String without space \nEnter one string with space \n"
				+ "");
		int a = sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.nextLine();
		char ch = sc.next().charAt(0);
		boolean bol = sc.nextBoolean();
		
		System.out.println("Integer => "+a);
		System.out.println("String S1 => "+s1);
		System.out.println("String S2 => "+s2);
		System.out.println("Character => "+ch);
		System.out.println("Boolean => "+bol);
		
	}

}
