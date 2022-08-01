package core_java_14_may_2022;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hashset ,treeset ,linkedhashet ,implements set
		//does not accept duplicate values
		//treeset is no guarentee that elements store
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");//its not taking duplicate value
		System.out.println(hs);//[USA, UK, INDIA]
		System.out.println(hs.remove("UK"));//it will remove UK//ans:true
		System.out.println(hs.isEmpty());//false
		System.out.println(hs.size());//3
		

	}

}
