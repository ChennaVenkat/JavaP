package ArrayPrograms;

import java.util.Scanner;

public class CountOfEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		System.out.println("The size of an array is :"+size);
		
		int arr[]=new int[size];
		System.out.println("Please enter the element in an array");
		for(int i=0;i<size;i++)  // this loop reads the elements in to an array
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("The array elements are : ");
		for(int i=0;i<size;i++) // this loop prints the elements in an array
		{
			System.out.print(arr[i]+" ");
		}
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println();
		System.out.println("the total even numbers in array is "+even);
		System.out.println("the total odd numbers in array is "+odd);
		
		sc.close();
	}
}
