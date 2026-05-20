package StringPrograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String rev = "";
		
		
		for(int i=str.length()-1; i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("The actual string is : "+str);
		System.out.println("the reversed string is : "+rev);

	}

}
