package JavaProgram;

public class StarPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		int no=5;
		for(i=0;i<no;i++)
		{
			for(j=no;j>no-i;j--)
			{
				System.out.print(" ");
			}
			
			for(j=no;j>i;j--)
			{
				System.out.print("*");
			}
			
			for(j=no-1;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
