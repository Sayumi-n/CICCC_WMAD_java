package wmad202;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Generate Prime numbers between 1 and " + input);
	    int max = input.nextInt();
	    
	    ArrayList<Integer> numberList = new ArrayList<Integer>();
	    int sizeOfList = numberList.size();
	    
	    // loop through the numbers one by one
	    for (int i = 1; i < max; i++) {

	        boolean isPrimeNumber = true;

	        // check to see if the number is prime
	        for (int j = 2; j < i; j++) {
	            if (i % j == 0) {
	                isPrimeNumber = false;
	                break; // exit the inner for loop
	            }
	        }

	        // print the number if prime
	        if (isPrimeNumber) {
	            System.out.print(i + " ");
	            numberList.add(i);
	            exportCsv(numberList);
	        }
	    }
	}
	    public static void exportCsv(ArrayList<Integer> numberList) {
	    	try {
	            FileWriter f = new FileWriter("C:\\sample\\sample.csv", false);
	            PrintWriter p = new PrintWriter(new BufferedWriter(f));
	            
	            int sizeOfList;
				for(int x = 0; x < sizeOfList; x++) {
	            	p.print(numberList[x]);
	            	p.println();
	            }
	            p.close();
	            System.out.println("Complete");
	    	}catch(IOException ex) {
	    		ex.printStackTrace();
	    	}
	    	
	    }
}



