package core_java_14_may_2022;

import java.util.HashMap;

public class Hashmap_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0,"Hello");
		hm.put(1,"World");
		hm.put(2,"How");
		hm.put(3,"Are");
		hm.put(4,"You");
		System.out.println(hm.get(3));//Ans:Are//now we are getting the string value using get and int value
		hm.remove(3);
		System.out.println(hm.get(3));//Ans:Are ,Null
		
		
		
		

	}

}
