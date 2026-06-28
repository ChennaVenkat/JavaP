package GeneralPrograms;

public class CharacterCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "hello@$123";
		
		int letterCount = 0;
		int digitCount = 0;
		int specialCharecterCount = 0;
		
		for (char ch:s.toCharArray()) {
			if(Character.isLetter(ch)) {
				letterCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharecterCount++;
			}
		}
		System.out.println("Total number of letters are : "+letterCount);
		System.out.println("Total number of digits are : "+digitCount);
		System.out.println("Total number of special character are : "+specialCharecterCount);
	}
}