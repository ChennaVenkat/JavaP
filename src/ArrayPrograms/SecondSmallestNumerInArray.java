package ArrayPrograms;

public class SecondSmallestNumerInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,9,6,4,5};
		
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		
		
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];				
			}
		}
		
		System.out.println("The smallest number is "+smallest);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>smallest && secondSmallest > arr[i]) {
				
				secondSmallest=arr[i];
			}
		}
		System.out.println("The second smallest number is "+secondSmallest);
	}

}
