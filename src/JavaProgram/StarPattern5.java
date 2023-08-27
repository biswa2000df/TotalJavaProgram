package JavaProgram;

public class StarPattern5 {

	public static void main(String[] args) {
		
		int i,j;
		int row=5;
		for(i=1;i<=row;i++)
		{
			for(j=0;j<row-i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			for(j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		for(i=0;i<row;i++)
		{
			
			for(j=row;j>=row-i;j--)
			{
				System.out.print(" ");
			}
			
			for(j=row-1;j>i;j--)
			{
				System.out.print("*");
			}
			
			for(j=row-2;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		


	}

}
