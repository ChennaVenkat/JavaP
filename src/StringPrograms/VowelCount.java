package StringPrograms;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		System.out.println("The entered string is : "+str);
		
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		
		System.out.println("The total number of vowels in a given string are : "+count);
		sc.close();
	}

}