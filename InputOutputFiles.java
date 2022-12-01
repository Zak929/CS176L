import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class InputOutputFiles {
	
   public static void main(String[] args) throws FileNotFoundException {
	  boolean fileFound = false;
	  Scanner input = new Scanner(System.in);
      //C:\Users\zakme\OneDrive\Documents\Javascript\InputOutputException\lines.txt
	  while(fileFound == false) {
		  
      try {
    	  System.out.println("Please enter the path to open the input file for example C:\\\\Downloads\\\\lines.txt : ");
    	  String reader = input.nextLine();
    	  File inputFile = new File(reader);
          PrintWriter outputFile = new PrintWriter("C:\\Users\\zakme\\OneDrive\\Documents\\Javascript\\InputOutputException\\outlines.txt"); 
          Scanner in = new Scanner(inputFile);
    	  while (in.hasNext()) {
    		  String what = in.next();
    		  outputFile.println(what);
    	  } 
          in.close();
          outputFile.close();
          fileFound = true;
          System.out.println("File found ending program");
      	 }
	  
      
      catch (FileNotFoundException ex) {
    	  System.out.println("File is not found, please try again");
      }
    	 
   }

   }
}

