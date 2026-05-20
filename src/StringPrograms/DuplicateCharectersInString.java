package StringPrograms;


// the below program prints duplicate characters only when they appear.
public class DuplicateCharectersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="programming";
		
		for(int i=0 ;i < s.length() ; i++) {
			for(int j=i+1 ; j < s.length() ; j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(i));
					break;
				}
			}
		}
	}

}
