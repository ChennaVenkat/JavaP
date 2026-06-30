package PatternPrograms;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4; // size of the patterns
		
		// outer for loop for rows
		for(int i=0;i<n;i++) {
			// inner for loop for columns
			for(int j=0;j<n;j++) {
				// prints '*' in a row and moves to next line after all iterations
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
