package JavaProgram;

public class StarPattern7 {

	public static void main(String[] args) {
		/*
*
**
***
****
*****
****
***
**
*
		 */
		
		int i,j;
		int row=5;
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1;i<row;i++)
		{
			for(j=0;j<row-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

	}

}
