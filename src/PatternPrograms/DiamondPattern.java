package PatternPrograms;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int a=n-2;a>=0;a--) {
			for(int b=0;b<=n-a;b++) {
				System.out.print(" ");
			}
			for(int c=0;c <=a ;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
