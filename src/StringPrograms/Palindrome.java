package StringPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter the string : ");
		
		//String str=sc.next(); // if we use this it reads only one word (it wont read 'kadak madam')
		
		String str=sc.nextLine();
		
		//String str="malayalam";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println("The actual string is : "+str);
		System.out.println("The reversed string is : "+rev);
		
		//if(str==rev) {
		if(str.equals(rev)) {
			System.out.println("The string is Palindrome");
		}else {
			System.out.println("The string is not palindrome");
		}
		
		System.out.println("the number of charecters in string are : "+str.length());
		
		
	}

}
