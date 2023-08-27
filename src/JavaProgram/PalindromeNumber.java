package JavaProgram;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int no=sc.nextInt();
		int temp=no;
		int rem=0;
		int rev=0;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(no==rev) 
			System.out.println("Number is palindrome number");
			else
				System.out.println("not a palindrome number");
		
		
		
	}

}
