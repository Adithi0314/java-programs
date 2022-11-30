package javaprograms;

import java.util.Scanner;

public class ListOfOddNumbers {

	public static void main(String[] args) {
		int number, i;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the limit: ");  
		number = sc.nextInt();    
		i=3;   
		System.out.print("List of odd numbers: ");  
		 
		while(i<=number)  
		{  
	
		System.out.print(i +" ");   
		
		i=i+3;  
	}
	}

}
