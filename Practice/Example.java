package Practice;

class Example{
	//creating local variables
	int id;
	String name;
	int rank;
	// three arg constructor
	Example (int i,String s,int a)
	{
		id=i;
		name=s;
		rank=a;	
	}
	//two arg constructor
	Example (int i,String s)
	{
		id=i;
		name=s;	
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+rank);
	}
	
	public static void main (String args[])
	{
		Example object1=new Example(1,"Raja",1);
		Example object2=new Example(2,"Pandian");
		object1.display();
		object2.display();
	 }  
	} 