package JavaProgram;

public class queuepartenjavapattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 15;
		
		int i=(int) ((int) Math.pow(2, 3) + Math.pow(2, 2) + Math.pow(2, 1)+1);
		System.out.println(i);
		
		if(no == i) {
		    System.out.println("2^3 + 2^2 + 2^1 + 1 = " + i);
		}
		else
			System.out.println("The sum of powers of 2 is not equal to the given number.");

	}

}
