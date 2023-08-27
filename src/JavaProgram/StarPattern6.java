package JavaProgram;

public class StarPattern6 {

	public static void main(String[] args) {
		/*
* * * * * * * * 
 * * * * * * * 
  * * * * * * 
   * * * * * 
    * * * * 
     * * * 
      * * 
       * 
		 */
		
		int i,j;
		int row=8;
		for(i=0;i<row;i++)
		{
			for(j=row;j>row-i;j--)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=row-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
