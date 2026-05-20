package JavaInterviewPrograms;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int inputNumber, temp;
		int sum=0,count=0;
		int digit=0;
		
		System.out.println("Enter the number : ");
		inputNumber=sc.nextInt();
		
		temp=inputNumber;
		/* this code is wrong
		for(int i=0;i<2;i++) {
			temp=temp % 10;
			count++;
		}
		System.out.println("The number of digits are "+ count);
		*/
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		System.out.println("The count is : "+count);
		temp=inputNumber;
		while(temp>0) {
			digit=temp%10;  // gives the last digit of the number
			sum +=  Math.pow(digit, count);
			temp=temp/10; 	// eliminates the last digit of the number
		}
		System.out.println("The total sum sum is : "+ sum);
		if(sum==inputNumber) {
			System.out.println("The number "+inputNumber+" is Amstong Number");
		}else {
			System.out.println("The number "+inputNumber+" is not Amstong Number");
		}
	}

}
