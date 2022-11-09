package javaprograms;

import java.util.Scanner;

public class CheckPositiveOrNegative {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("the number is positive");
			
		}
		else if(num<0)
		{
			System.out.println("the number is negative");
		}
		else {
			System.out.println("the number is zero");
		}
	}

}
