package core_java_hw;

public class Types_of_variables_instance_variable {
	
	String name = "Raja";	// INSTANCE VARIABLE declaration(String variable name = Value)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INSTANCE VARIABLE in this method we can use the object method ,
		//we create the object inside the class and we use that to print
		
		Types_of_variables_instance_variable object = new Types_of_variables_instance_variable();
		                                       //new object in the class name 
		
		System.out.println(object.name);//ans : Raja
		

	}

}
