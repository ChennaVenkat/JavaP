package GeneralPrograms;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		// outer for loop for  number of rows
		for(int i=0;i<n;i++) {
			// first inner loop for spaces
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			//second inner loop for printing stars
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
