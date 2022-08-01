package core_java_14_may_2022;

import java.util.ArrayList;

public class Array_list_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> a = new ArrayList<String>();
		  a.add("Sachin");
		  a.add("java");
		  System.out.println(a);//[Sachin, java]
		  a.add(0,"Student");
		  System.out.println(a);//[Student, Sachin, java]
		  /*a.remove(1);
		  a.remove("java");
		  System.out.println(a);*///[Student]
		  System.out.println(a.get(2));
		  //Testing
		  System.out.println(a.contains("testing"));//false
		  a.add("java");//adding a duplicate value 
		  System.out.println(a);//[Student, Sachin, java, java]
		  
		  

	}

}
