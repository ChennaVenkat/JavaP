package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {1,2,3,2,4,1,5,3,6};
		
		//Create a hash set
		  HashSet<Integer> uniqueNumbers = new HashSet<>();
		  
		  //add all ements to hash set
		  for(int num:numbers) {
			  uniqueNumbers.add(num);
		  }
		  
		  System.out.println("Unique elements: "+uniqueNumbers);

	}

}
