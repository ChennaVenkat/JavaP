package JavaInterviewPrograms;

// Write a program to reverse a string in java using inbuilt methods
public class ReveseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="kiran";
		String rev = "";
		StringBuilder sb=new StringBuilder(str);
		rev=sb.reverse().toString();
		System.out.println(rev);
		
	}

}
