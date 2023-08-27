package JavaProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int no=sc.nextInt();
		int temp=no;
		int arm=0;
		int rem=0;
		int nocount=0;
		while(temp>0) {
			temp=temp/10;
			nocount++;
		}

//		System.out.println("Total digit present ="+nocount);
		
		temp=no;
		while(temp>0)
		{
			rem=temp%10;
			arm=(int) (arm+Math.pow(rem, nocount));
			temp=temp/10;
		}
		if(arm==no)
			System.out.println("It is an armstrong number");
		else
			System.out.println("It is not an armstrong number");
		
	}

}
