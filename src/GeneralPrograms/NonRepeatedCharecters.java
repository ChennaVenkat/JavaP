package GeneralPrograms;

public class NonRepeatedCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "swiss";
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}

	}

}
