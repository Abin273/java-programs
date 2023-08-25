package Array;

import java.util.Scanner;

public class SortDescendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[20];
		System.out.println("enter the array size: ");
		int n=sc.nextInt();
		System.out.println("enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("After sort: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
