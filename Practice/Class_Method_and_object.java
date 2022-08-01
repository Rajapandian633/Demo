package Practice;  // class is not a real world entity.
           
//Access modifier class class name// class name starts with upper case its called us Pascal naming
public class Class_Method_and_object {  // it's just a template or blueprint its doesn't occupy any memory.
	
//Access modifier Return type method name(list of parameters)
	public void eat() //Methods -(A set of codes which perform a particular task) 
	{
		System.out.println("Hello");
	}
	
	public void run()
	{
		System.out.println("World");
	}
 
	                  // method name starts with lower case its called us camel naming
	public static void main(String[] args) { //representing the behavior of the object is method
		
	//  class name reference variable =keyword class name();	
		Class_Method_and_object object1=new Class_Method_and_object(); //object is an instance of class
		                                                        // object is real world entity
		                                                       // object occupies memory
	//	reference variable.method name();
		object1.eat();
		object1.run();
		
	}//closing main method
}//closing class
/*
class:
1.class is not a real world entity.
2.class name starts with upper case its called us Pascal naming.
3.it's just a template or blueprint its doesn't occupy any memory.
4.Access modifier class class name.
Methods:
1.Methods -(A set of codes which perform a particular task)
2.Access modifier Return type method name(list of parameters)
3.method name starts with lower case its called us camel naming.
4.representing the behavior of the object is method
object:
1.object is an instance of class.
2.object is real world entity,object occupies memory.
3.class name reference variable =keyword class name();
*/