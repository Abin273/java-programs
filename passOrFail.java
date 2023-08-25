package Day1;
import java.util.Scanner;

public class mark {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark:");
		float mark=sc.nextFloat();
		if(mark<50) {
			System.out.println("Failed.");
		}else if(mark<=100) {
			System.out.println("Passed.");
		}else {
			System.out.println("invalid input");
		}
	}

}
