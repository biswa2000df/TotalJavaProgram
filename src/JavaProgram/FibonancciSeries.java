package JavaProgram;

import java.util.Scanner;

public class FibonancciSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int no=sc.nextInt();
//		int a=1,b=1;
//		int c=0;
//		int i=2;
//		System.out.print(a+" "+b);
//		while(i<no) {
//			c=a+b;
//			System.out.print(" "+c);
//			a=b;
//			b=c;
//			i++;
		int a=1,b=0;
		int c=0;
		for(int i=0;i<no;i++) {
		c=a+b;
		System.out.print(c+" ");
		a=b;b=c;
		
			
		}
		

	}

}
