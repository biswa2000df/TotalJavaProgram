package JavaProgram;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Filenamechangemodify {

	public static void main(String[] args) throws IOException {
		
		 String s40=null;
		File dir=new File("C:\\Users\\biswa\\eclipse-workspace\\TotalJavaProgram\\newfolder\\");
		 File[] files = dir.listFiles();

	        Arrays.sort(files, new Comparator<File>() {
	            public int compare(File f1, File f2) {
	                return Long.valueOf(f2.lastModified()).compareTo(f1.lastModified());
	            }
	        });

	        for (int i = 0; i < files.length; i++) {
	            
	           
	              s40 = files[0].getPath();
	              Desktop desktop=Desktop.getDesktop();
	  		
	              dir.delete();
	              System.out.println(s40);
	             
	              break;

	        }
			
		File oldfile=new File(s40);
		String nm="kanha33.txt";
		String sn="C:\\Users\\biswa\\eclipse-workspace\\TotalJavaProgram\\newfolder\\"+nm;
		File newfile=new File(sn);
		if(oldfile.renameTo(newfile)) {
			System.out.println("File renamed successfully");
			System.out.println(sn);
		}
		else
			System.out.println("File renamed failed");
		
		
		
		
		
		
		
		int min=20;
		int max=40;
		
		int b=(int)(Math.random()*(max-min+1)+min);
		System.out.println(b);
		
		
		//////date/////
		 SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date));  
		    
		    SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");  
		    Date date1 = new Date();  
		    System.out.println(formatter1.format(date1));  
		
		
		
//		  String filePath = "C:\\Users\\biswa\\Desktop\\New folder (4)\\kanha1.txt";
		    String filePath=sn;
          Scanner sc = new Scanner(new File(filePath));
          StringBuffer buffer = new StringBuffer();


     
          
     

          
          while (sc.hasNextLine()) {
             buffer.append(sc.nextLine()+System.lineSeparator());
          }
          String fileContents = buffer.toString();
          
   
          System.out.println("Contents of the file: "+fileContents);


          String s=fileContents.substring(52, 54);	   
		    System.out.println(s);
		    
		    String dat=fileContents.substring(39, 47);
		    System.out.println(dat);
          
          sc.close();
          String oldLine = "sahoo";
          String newLine = "Enjoy";
          
          String dt=dat;
          
          
          String ran=s;
          String rand=Integer.toString(b);
          
          
          
          fileContents = fileContents.replaceAll(oldLine, newLine);
          fileContents = fileContents.replaceAll(dt, formatter.format(date));
          fileContents = fileContents.replaceAll(ran, rand);
         
       
//          str.substring(0, 48) + b + str.substring(25);

          FileWriter writer = new FileWriter(filePath);
         
          System.out.println("");
          System.out.println("new data: "+fileContents);
         
          writer.append(fileContents);  
          
          writer.flush();
         
		

	}

}
