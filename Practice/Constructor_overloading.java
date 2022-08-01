package Practice;

//Java program to overload constructors  
class Constructor_overloading{  
  int id;  
  String name;  
  int age;
  
  //creating two arg constructor  
  Constructor_overloading(int i,String n){  
  id = i;  
  name = n;  
  } 
  
  //creating three arg constructor  
  Constructor_overloading(int i,String n,int a){  
  id = i;  
  name = n;  
  age=a;  
  } 
  
  public void display()
  {
  System.out.println(id+" "+name+" "+age); 
  }
 
  public static void main(String[] args){  
	  Constructor_overloading object1 = new Constructor_overloading(1,"Raja");  
	  Constructor_overloading object2 = new Constructor_overloading(2,"Pandian",3);  
	  object1.display();  
	  object2.display();  
 }  
}  