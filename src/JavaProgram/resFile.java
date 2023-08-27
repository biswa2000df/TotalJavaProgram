package JavaProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class resFile {

	public static void main(String[] args) throws IOException {

		  String filePath = "C:\\Users\\biswa\\Desktop\\PFMS DOWNLOADFILE\\ACHCROW_E3FY7_03122022_170474_PFMS (1).txt";
          Scanner sc = new Scanner(new File(filePath));
          StringBuffer buffer = new StringBuffer();
          while (sc.hasNextLine()) {
             buffer.append(sc.nextLine()+System.lineSeparator());
          }
          String fileContents = buffer.toString();
          System.out.println("Contents of the file: ");
          System.out.println(fileContents);
          System.out.println(fileContents.length());
          
          String d=fileContents.substring(387, 396);
          String ss=fileContents.substring(379, 387);
          
          String onlyone=fileContents.substring(132, 156);
          System.out.println(onlyone);
          String newone="211111111111111111111111";
          
          SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date));  
		    System.out.println(d);
		    
		    
		    String rowone=fileContents.substring(438, 464);
		    System.out.println(rowone);
		    String rowtwo=fileContents.substring(746, 772);
		    System.out.println(rowtwo);
		    String rowthree=fileContents.substring(1054, 1080);
		    System.out.println(rowthree);
		    
		    String rowtwo23=fileContents.substring(616, 749);
		    System.out.println(rowtwo23);
		    System.out.println(rowtwo23.length());
		    String rowtwo44=rowtwo23.substring(2,133);
		    System.out.println(rowtwo44);
		    
		    
          
          sc.close();
          String oldLine =ss+"        N";
          System.out.println(oldLine);
          String c="        N";
          
          String row1="10011111111111111111111100";
          String row2="20011111111111111111111004";
          String row3="30011111111111111111111398";
         String row44="44";
          
        
          fileContents = fileContents.replaceAll(onlyone,newone);
          fileContents = fileContents.replaceAll(rowone,row1);
          fileContents = fileContents.replaceAll(rowtwo,row2);
          fileContents = fileContents.replaceAll(rowthree,row3);         
          fileContents = fileContents.replaceAll(rowtwo23,row44+rowtwo44);
          
          
          fileContents = fileContents.replaceAll(oldLine,formatter.format(date)+c);
          FileWriter writer = new FileWriter(filePath);
          System.out.println("");
          System.out.println("new data: ");
          System.out.println(fileContents);
          writer.append(fileContents);
          writer.flush();

	}

}
