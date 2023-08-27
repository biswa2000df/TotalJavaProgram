package JavaProgram;

public class StarPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
 	*
   **
  ***
 ****
 
 
 	*
   * *
  * * *
 * * * *
 		*/
		int i=1,j=0,row=5;
		for(i=1;i<row;i++)
		{
			for(j=row-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
  
		

	}

}
