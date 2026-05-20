package ArrayPrograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("The sum of the array is : "+sum);
		double avg=(double)sum/arr.length;
		
		System.out.println("The average of an array : "+avg);

	}

}
