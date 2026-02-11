package JavaInterviewPrograms;

public class SwapStringswithConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "Lenovo";
		String str2= "Ideapad";
		
		
		System.out.println("Before Swapping string1 is "+str1);
		System.out.println("Before Swapping string2 is "+str2);
		
		System.out.println();
        // Swapping without temp
		str1 = str1+str2; // Combine both the strings str1 and str2 using the concatenation(+) operator
		str2 = str1.substring(0, str1.length()-str2.length()); // (0,13-7 =6) --> (0,6)
		str1 = str1.substring(str2.length());
		
		System.out.println("After Swapping string1 is "+str1);
		System.out.println("After Swapping string2 is "+str2);
		
		
		
		
	}

}
