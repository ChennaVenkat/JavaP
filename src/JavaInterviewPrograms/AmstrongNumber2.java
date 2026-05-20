package JavaInterviewPrograms;

import java.util.Scanner;

public class AmstrongNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber,temp;
		Scanner sc = new Scanner(System.in);
		inputNumber=sc.nextInt();
		int sum=0;
		temp=inputNumber;
		String digits=String.valueOf(inputNumber);
		int count=digits.length();
		
		while(temp>0) {
			int digit=temp%10;
			sum+=Math.pow(digit, count);
			temp=temp/10;
		}
		System.out.println("The total sum is : "+ sum);
		if(inputNumber==sum) {
			System.out.println("The number "+inputNumber+" is Armstrong");
		}else {
			System.out.println("The number "+inputNumber+" is not Armstrong");
		}
		
		/*
		int inputNumber, temp, digit;
		int count=0;int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number : ");
		inputNumber=sc.nextInt();
		temp=inputNumber;
		System.out.println("the input number is : "+inputNumber);
		
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		System.out.println("the total count of digits are : "+count);
		temp=inputNumber;
		while(temp>0) {
			digit=temp%10; //results the last digit of the number
			sum+=Math.pow(digit, count);
			temp=temp/10;  //eliminates the last digit in the number
		}
		System.out.println("The total sum is : "+ sum);
		if(inputNumber==sum) {
			System.out.println("The number "+inputNumber+" is Armstrong");
		}else {
			System.out.println("The number "+inputNumber+" is not Armstrong");
		}
		*/
		
	}

}
