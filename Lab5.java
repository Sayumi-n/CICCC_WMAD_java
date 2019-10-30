package labs;

import java.util.Scanner;
//Java util package contains collection framework, collection classes, classes related to date and time.
public class Lab5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a = "";
    String b = "";
    Scanner word = new Scanner(System.in);
    System.out.print("Enter the word: ");
    a = word.nextLine();
    int n = a.length();
    for (int i = n -1; i >= 0; i--) {
    	b = b + a.charAt(i);
       // returns the character at the specified index in a String.
    }
    if(a.equalsIgnoreCase(b)) {
    	System.out.println("It's a palindrome.");
    }
    else {
	System.out.println("It's not a palindrome.");
	}
	}
}
