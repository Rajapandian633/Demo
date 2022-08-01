package Practice;    //constructor is used to initialize the object 

class Constructor{    //constructor doesn't have any return type //so it doesn't return any value
	
	Constructor(int i)    //constructor name should be a class name //with parameter like int
	{
		System.out.println("Hello");
	}
	
	Constructor(String s)    //constructor name should be a class name //with parameter like String
	{
		System.out.println("World");
	}
	
	public static void main(String[] args) {
		
		Constructor c=new Constructor(5);  //creating object to execute the constructor
		Constructor c1=new Constructor("s"); // we can overload the constructor
	}	
}
/*
Constructor:
1.constructor is used to initialize the object.
2.constructor doesn't have any return type, so it doesn't return any value.
3.constructor name should be a class name.
4.we can overload the constructor

types of constructor :  
1. Default constructor - (after created the object when we run the code java create the
   default constructor to initialize the object)
2.No Argument constructor - (constructor without any argument like int,string )
3.Parameterized constructor - (constructor with arguments like int i,string s)*/