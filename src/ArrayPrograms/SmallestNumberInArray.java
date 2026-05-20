package ArrayPrograms;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,6,7,-9,2};
		
		int smallest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("The smallest number is "+smallest);
	}

}
