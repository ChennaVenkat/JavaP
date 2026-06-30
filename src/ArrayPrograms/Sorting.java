package ArrayPrograms;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8, 1, 3, 12, 11};
		
		System.out.println("Array before sorting "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting "+Arrays.toString(a));
		
		// Arrays always sorts in ascending order
	}

}
