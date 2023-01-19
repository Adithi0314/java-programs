package javaprograms;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		  int balance = 50000, withdraw, deposit;  
          
	        //create scanner class object to get choice of user  
	        Scanner sc = new Scanner(System.in);  
	          
	        while(true)  
	        {  
	              
	            System.out.println("Choose 1 for Withdraw");  
	            System.out.println("Choose 2 for Deposit");  
	            System.out.println("Choose 3 for Check Balance");  
	            System.out.println("Choose 4 for EXIT");  
	     
	              
	            //get choice from user  
	            int choice = sc.nextInt();  
	            switch(choice)  
	            {  
	                case 1:  
	        System.out.print("Enter money to be withdrawn:");  
	                      
	        //get the withdrawl money from user  
	        withdraw = sc.nextInt();  
	                      
	        //check whether the balance is greater than or equal to the withdrawal amount  
	        if(balance >= withdraw)  
	        {  
	            //remove the withdrawl amount from the total balance  
	            balance = balance - withdraw;  
	            System.out.println("Please collect your money");  
	        }  
	        else  
	        {  
	            //show custom error message   
	            System.out.println("Insufficient Balance");  
	        }  
	        System.out.println("");  
	        break;  
	   
	                case 2:  
	                      
	        System.out.print("Enter money to be deposited:");  
	                      
	        //get deposite amount from the user  
	        deposit = sc.nextInt();  
	                      
	        //add the deposit amount to the total balanace  
	        balance = balance + deposit;  
	        System.out.println("Your Money has been successfully deposited");  
	        System.out.println("");  
	        break;  
	   
	                case 3:  
	        //displaying the total balance of the user  
	        System.out.println("Balance : "+balance);  
	        System.out.println("");  
	        break;  
	   
	                case 4:  
	        
	        System.exit(0);  
	            }  
	        }  

	}

}
