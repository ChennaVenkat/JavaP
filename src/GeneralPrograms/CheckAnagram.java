 package GeneralPrograms;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "listen";
		String s2= "silent";
		
		char []a=s1.toCharArray();
		char []b=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			System.out.println("Strings are anagrams");
		}	else {
			System.out.println("Strings are not anagrams");
		}

	}

}
