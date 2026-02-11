package JavaInterviewPrograms;


// Write a Java Program to swap two given Strings
public class SwapStringsUsingStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Chenna";
		String str2 = "Venkat";
		
		System.out.println("Before Swapping string1 is "+str1);
		System.out.println("Before Swapping string2 is "+str2);
		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		sb.append(str1).append(str2);
		
		str2=sb.substring(0, str1.length());
		str1=sb.substring(str1.length());
		
		System.out.println("After Swapping string1 is "+str1);
		System.out.println("After Swapping string2 is "+str2);
		
	}

}
