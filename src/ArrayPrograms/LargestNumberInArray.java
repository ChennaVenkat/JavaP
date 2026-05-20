package ArrayPrograms;

import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the elements in array : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("The elements in an array are : ");
		for(int i = 0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int largest =Integer.MIN_VALUE;
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(largest < arr[i]) {
				largest=arr[i];
			}
		}
		
		System.out.println("The largest numer in an array is : "+largest);
		
		/*
		int arr[]= {15,20,30,40,50};
		int largest= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("The largest number is "+largest);
		*/
	}

}
