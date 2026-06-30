package StringPrograms;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
			String input = "automation";
	        StringBuilder output = new StringBuilder();
	

	        for (int i = 0; i < input.length(); i += 2) {

	            if (i + 1 < input.length()) {
	                output.append(input.charAt(i + 1));
	                output.append(input.charAt(i));
	            } else {
	                output.append(input.charAt(i));
	            }

	        }

	        System.out.println(output);
	}

}
