package core_java_14_may_2022;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int count = 0;  
		   while(count <=100){  // while loop is true untill the condition is true
		   System.out.println("hello world:"+count);  
		   count =count +1;  
		    
		    if (count ==30) { 
		    	//break; //ith will stop at 29
		    	continue; // its jump 30 will print upto 100
		    }
		    }  

	}

}
