package StringPrograms;

public class StringCleaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " %^&  hello (* Joe( 3 ";
		
		String replacedString = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The replaced string is "+replacedString);

	}

}
