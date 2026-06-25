package GeneralPrograms;

public class CharecterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "programming";
		char target='g';
		int count =0;
		
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i)==target) {
				count++;
			}
		}
		System.out.println("The occurence of the charecter "+target+" is "+count);

	}

}
