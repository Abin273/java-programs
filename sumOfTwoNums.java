package Day1;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer: ");
		int i=sc.nextInt();
		System.out.println("enter a float value: ");
		float f=sc.nextFloat();
		
		float sum=i+f;
		System.out.println("sum is : "+sum);
        
	}
}
