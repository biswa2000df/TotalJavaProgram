package JavaProgram;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int no=sc.nextInt();
		if(no==1 || no==0)
		{
			System.out.println("It is not prime number");
		}
		int count=0;
	
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==0)
			System.out.println("The number is prime number");
		else
			System.out.println("The number is not a prime number");
		
	}

}
