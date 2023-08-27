package org.inmakestest;

import java.util.Scanner;

public class Scannerclass { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.What is your name ?");
		String name = scanner.nextLine();
		System.out.println("Ans : Hello "+name);

		System.out.println("2.What is your rating ?");
		int rating = scanner.nextInt();
		scanner.nextLine(); // must give 
		System.out.println("Ans : You rated as "+rating);
		System.out.println("3.What is your email?");
		String email = scanner.nextLine();
		System.out.println("Ans : Email is "+email);
		

		
	}

}
