package ArrayPrograms;

public class secondLargestNumberinReverseLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,4,5,6,7,7,1};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i= arr.length-1;i>=0;i--) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i] !=largest) {
				secondLargest=arr[i];
			}
		}
		
		System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);

	}

}
