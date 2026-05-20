package HashMap;

import java.util.HashMap;

public class StudentDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashMap = new HashMap();
		
		hashMap.put(101, "Anil");//  Insert value
		hashMap.put(102, "Ken");
		hashMap.put(103, "Sid");
		hashMap.put(105, "Kunal");
		hashMap.put(104, "Raghu");
		hashMap.put(106, "raj");
		hashMap.remove(104);
		System.out.println(hashMap);
		
		System.out.println();
		System.out.println(hashMap.get(101)); //Get value using key
		
		System.out.println(hashMap.get(102));
		System.out.println(hashMap.get(103));
		
		System.out.println(hashMap.get(104));
		
		System.out.println(hashMap.get(104));
		System.out.println(hashMap.get(104));
		
		
		System.out.println("The size of hash map is "+hashMap.size()); // Get number of elements
		
		
		
		System.out.println(hashMap.containsKey(101)+" status1"); //Check key
		
		System.out.println(hashMap.containsValue("raj")+" status2"); // check value
		
		
		HashMap<String,String> data = new HashMap();
		data.put("username", "venky");
		data.put("password", "123456");
		
		System.out.println(data);
	}

}
