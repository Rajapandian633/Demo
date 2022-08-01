package core_java_hw;

public class String_comparision_using_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "10";
		
		String str2 = "10";
		
		String str3 = "15";
		
		String str4 = "20";
		
		System.out.println(str1.equals(str2));//ans:true
		
		System.out.println(str1.equals(str3));//ans:false
		
		System.out.println(str1.equals(str4));//ans:false
		
		System.out.println(str2.equals(str4));//ans:false
		
		
		

	}

}
