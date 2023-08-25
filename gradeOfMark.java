package Day1;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your  total mark percentage: ");
		float totalMark=sc.nextFloat();
		
		if(totalMark<=100 && totalMark>=0) {
			if(totalMark>90) {
				System.out.println("A");
			}else if(totalMark>=80) {
				System.out.println("B");
			}else if(totalMark>=70) {
				System.out.println("C");
			}else if(totalMark>=60) {
				System.out.println("D");
			}else if(totalMark>=50) {
				System.out.println("E");
			}else {
				System.out.println("failed.");
			}
		}else {
			System.out.println("Invalid entery");
		}
		
		
	}
