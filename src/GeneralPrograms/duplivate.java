package GeneralPrograms;

import java.util.Scanner;

public class duplivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of an array : ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the elements into array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the array elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int largest= Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		
		int smallest= Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=size-1;i>=0;i--) {
			if(arr[i]<smallest) {
				 //secondSmallest = smallest;
				smallest=arr[i];
			}
		}
		
		for(int i=size-1;i>=0;i--) {
			if(arr[i]<smallest && arr[i]!=smallest) {
				secondSmallest=arr[i];
			}
		}
		
		
		
		
		System.out.println("The largest number in array is : "+largest);
		System.out.println("The second Largest number in array is : "+secondLargest);
		
		System.out.println("The smallest number is : "+smallest);
		System.out.println("The second smallest number is : "+secondSmallest);
		/*
		int arr[]= {2,1,5,6,2,9,1,4,6,7,7,8,9};
		
		for(int i = 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		*/
		
		/*
		String s= "programming";
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(i));
					break;
				}
			}
		}
		*/
		
	}	
}
