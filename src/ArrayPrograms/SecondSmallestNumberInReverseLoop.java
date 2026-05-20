package ArrayPrograms;

public class SecondSmallestNumberInReverseLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {14,3,9,21,7,3};
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]<smallest) {
				secondSmallest= smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
		}
		System.out.println("The smallest number is: "+ smallest);
		System.out.println("The second smallest number is: "+ secondSmallest);

	}

}
