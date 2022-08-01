package Practice;

//Java Program to demonstrate the use of the parameterized constructor.  
class Parameterized_constructor{  
  int id;  
  String name; 
  
  //creating a parameterized constructor  
  Parameterized_constructor(int i,String n){  
  id = i;  
  name = n;  
  }
  
  //method to display the values  
  public void display()
      {
	  System.out.println(id+" "+name);
	  }  
 
  public static void main(String args[]){  
  //creating objects and passing values  
	  Parameterized_constructor object1 = new Parameterized_constructor(1,"Raja");  
	  Parameterized_constructor object2 = new Parameterized_constructor(2,"Pandian");
	  
  //calling method to display the values of object  
	  object1.display();  
	  object2.display();  
 }  
}  
