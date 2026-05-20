package GeneralPrograms;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of terms :");
		
		int n=sc.nextInt();
		//0 1 2 
		int first =0, second=1;
		
		for(int i=0;i<n;i++) {
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;
		}
		
		sc.close();

	}

}
