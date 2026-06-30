package PatternPrograms;

public class InvertedRightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int n=5;
		for(int i=n; i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		// Also can write in the below format
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
