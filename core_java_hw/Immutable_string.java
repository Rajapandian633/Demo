package core_java_hw;

public class Immutable_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//immutable string
		
		String str = "Sachin";
		
		str.concat("Tendulkar");//concat() method appends the string at the end  
		
		System.out.println(str);//will print Sachin because strings are immutable objects 
		
		//Test immutable string1
		
		String s="Sachin";  
		
		   s=s.concat(" Tendulkar");  
		   
		   System.out.println(s);
		   
		   //Output:Sachin Tendulkar



	}

}
