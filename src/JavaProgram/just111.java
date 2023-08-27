package JavaProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class just111 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fileName = "C:\\Users\\biswa\\Desktop\\New folder (4)\\kanha1.txt";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    int linecount=0;
		    while (line != null) {
		    	
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    
		    System.out.println(everything);
		   
		    
		    String s=everything.substring(52, 54);	   
		    System.out.println(s);

		    
		    
		} finally {
		    br.close();
		}
		

	}

}
