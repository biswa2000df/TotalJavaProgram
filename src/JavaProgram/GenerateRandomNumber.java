package JavaProgram;



import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int min=20;
		int max=40;
		double a=Math.random()*(max-min+1)+min;
		System.out.println(a);
		
		int b=(int)(Math.random()*(max-min+1)+min);
		System.out.println(b);
		
		
		///////////////////////data print paei./////////////////
//		  SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");  
//		    Date date = new Date();  
//		    System.out.println(formatter.format(date));  
		
		

	}

}
