package GeneralPrograms;

import java.util.Arrays;

public class AnagramProgram {
	
	public static boolean isAnagram(String first,String second) {
		
		if(first==null || second== null) {
			return false;
		}
		
		if(first.length() != second.length()) {
			return false;
		}
		
		char[] firstString = first.toLowerCase().toCharArray();
		char[] secondString = second.toLowerCase().toCharArray();
		
		Arrays.sort(secondString);
		Arrays.sort(firstString);

		return Arrays.equals(firstString, secondString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first="listen";
		String second = "silent";
		
		//isAnagram(first, second);
		if(isAnagram(first, second)) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings not are anagram");

		}

	}

}
