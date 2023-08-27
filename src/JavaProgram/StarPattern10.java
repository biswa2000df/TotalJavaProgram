package JavaProgram;

public class StarPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		int row=8;
		for(i=0;i<row;i++)
		{
			for(j=0;j<=row/2;j++)
				
			{
				if((j==0 || j==row/2 ) && i!=0 || i==row/2  || i==0 && j!=row/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
