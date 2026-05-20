package ArrayPrograms;

import java.util.Scanner;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements into an array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements in an array are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < secondSmallest && arr[i] !=smallest) {
				secondSmallest=arr[i];
			}
		}
		System.out.println("The second smallest number is : "+secondSmallest);
		System.out.println("The smallest number is : "+smallest);
		
		/*
		int arr[]= {5,1,5,9,2,7};
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest = smallest;
				smallest=arr[i];
			} 
			else if(arr[i]<secondSmallest && arr[i] != smallest) {
				secondSmallest=arr[i];
			}
		}
		System.out.println("The smallest number is: "+ smallest);
		System.out.println("The second smallest number is: "+ secondSmallest);
		
		*/
	}

}
