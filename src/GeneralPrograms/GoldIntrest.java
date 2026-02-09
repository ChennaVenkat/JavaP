package GeneralPrograms;

import java.util.Scanner;

public class GoldIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double gold = 36;
//		double simpleIntrest = 0;
//		double r=18;
//		int time = 5;
//		double compoundIntrest;
//		simpleIntrest=(gold*time*r)/100;
//		System.out.println(simpleIntrest);
		
		double gold , rateOfIntrest, simpleIntrest, compoundIntrest;
		int time;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity of gold in grams : ");
		gold = sc.nextDouble();
		System.out.println("Enter the rate of intrest :");
		rateOfIntrest = sc.nextDouble();
		System.out.println("Enter the time period in terms of years :");
		time = sc.nextInt();
		simpleIntrest=(gold*time*rateOfIntrest)/100;
		System.out.println(simpleIntrest+ " grams you got as intrest");
	}

}
