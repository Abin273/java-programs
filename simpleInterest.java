package Day1;

import java.util.Scanner;

public class interest {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount:");
		int P=sc.nextInt();
		System.out.println("Enter Interest rate: ");
		float R=sc.nextFloat();
		System.out.println("Enter NUmber of years");
		float n=sc.nextFloat();
		float SI=(P*R*n)/100;
		System.out.println("Simple Interest: "+SI);
        
	}

}
