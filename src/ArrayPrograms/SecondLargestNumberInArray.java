package ArrayPrograms;

import java.util.Scanner;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enetr the size of an array : ");
				int size=sc.nextInt();
				int arr[]=new int[size];
				System.out.println("Enter the elements in array : ");
				for(int i=0;i<size;i++) {
					arr[i]=sc.nextInt();
				}
				System.out.print("The elemenets in an array are : {");
				for(int i=0;i<size;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.print("}");
				System.out.println();
				
				int largest=Integer.MIN_VALUE;
				int secondLargest= Integer.MIN_VALUE;
				
				for(int i=0;i<arr.length;i++) {
					if(largest< arr[i]) {
						secondLargest=largest;
						largest=arr[i];
					}
				}
				
				for(int i=0;i<arr.length;i++) {
					if(secondLargest < arr[i] && arr[i] != largest )  {
						secondLargest=arr[i];
					}
				}
				
				System.out.println("The first larget number is : "+largest);
				System.out.println("The second largest number is : "+secondLargest);
		
		/*
		int arr[]= {1,4,3,2,5};
		
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		
		// to find the largest number
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]> secondLargest && arr[i] != largest) {
				secondLargest=arr[i];
			}
		}
		
		System.out.println("The largest number is "+largest);
		System.out.println("The largest number is "+secondLargest);	
		
		*/
	}

}
