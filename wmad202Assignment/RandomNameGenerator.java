package wmad202Assignment;

import java.util.ArrayList;
import java.util.Random;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;


public class RandomNameGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String fileFirstName = "first_names.all.txt";
    String fileLastName = "last_names.all.txt";
    ArrayList<String> firstNames = new ArrayList<String>();
    ArrayList<String> lastNames = new ArrayList<String>();
 
    
    try{
     BufferedReader inFirstName = new BufferedReader (new FileReader(fileFirstName));
    
     while (inFirstName.ready()) {
    	firstNames.add(inFirstName.readLine());
     }
     inFirstName.close();
    
     BufferedReader inLastName = new BufferedReader (new FileReader(fileLastName));
     while (inLastName.ready()) {
    	lastNames.add(inLastName.readLine());
     }
     inLastName.close();
    }
	
    catch(FileNotFoundException ex) {
    	System.out.println("Unable to open file");
    }
    catch(IOException ex) {
    	System.out.println("Error readin file");
    }
    
    
//    String rFirstName = firstNames.get(rFirstName.next(firstNames.size()));
//    String rLastName = lastNames.get(rLastName.next(lastNames.size()));
    

    	
    }

}
