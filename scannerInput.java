package Day1;

import java.util.Scanner;

public class charInput {
   public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character: ");
		char c=sc.next().charAt(0);
		System.out.println("entered character is: "+c);
        
   }
}
