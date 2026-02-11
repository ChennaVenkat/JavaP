package JavaInterviewPrograms;


// Write a Java Program to swap two given Strings
public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Chenna";
		String str2 = "Venkat";
		
		System.out.println("Before Swapping string1 is "+str1);
		System.out.println("Before Swapping string2 is "+str2);
		
		System.out.println();
		// swapping happens here
		String temp = str1;  // here str1=Chenna is assigned to 'temp' variable
		str1=str2;				// here str2=Venkat is assigned to 'str1' variable 
		str2=temp;				// here temp=Chenna is assigned to 'str2' variable
		
		System.out.println("After Swapping string1 is "+str1);
		System.out.println("After Swapping string2 is "+str2);
	}

}
