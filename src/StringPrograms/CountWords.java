package StringPrograms;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java Programming is easy";
		
		String[] words = str.trim().split("\\s+");
		
		System.out.println("Total words in the string are : "+words.length);

	}

}
