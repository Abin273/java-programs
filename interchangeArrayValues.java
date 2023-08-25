package Day1;

import java.util.Scanner;

public class SwapArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array: ");
		int size=sc.nextInt();
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		System.out.println("Enter the values of array 1: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the values of array 2: ");
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			int temp=arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=temp;
		}
		
		System.out.println("Array after swapping.");
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
