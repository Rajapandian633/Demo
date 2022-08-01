package Practice;

//Let us see another example of default constructor  
//which displays the default values 

class Default_constructor{  
int id=1;  
String name="Raja";

//method to display the value of id and name  
public void display()
   {
	System.out.println(id+" "+name);
   }

public static void main(String args[]){  
//creating objects  
Default_constructor object1=new Default_constructor();  
Default_constructor object2=new Default_constructor();

//displaying values of the object  
object1.display();  
object2.display();  
}  
}  