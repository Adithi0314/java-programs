package javaprograms;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		  // create an object of Scanner class
	    Scanner sc = new Scanner(System.in);

	    // take input from users
	    System.out.print("Enter the principal: ");
	    double principal = sc.nextDouble();

	    System.out.print("Enter the rate: ");
	    double rate = sc.nextDouble();

	    System.out.print("Enter the time: ");
	    double time = sc.nextDouble();

	    double interest = (principal * time * rate) / 100;

	    System.out.println("Principal: " + principal);
	    System.out.println("Interest Rate: " + rate);
	    System.out.println("Time Duration: " + time);
	    System.out.println("Simple Interest: " + interest);

	    sc.close();

	}

}
