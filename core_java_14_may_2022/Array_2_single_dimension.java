package core_java_14_may_2022;

public class Array_2_single_dimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];//declare an array and allocate
		a[0]=2;
		a[1]=6;
		a[2]=1;
		a[4]=12;
		
		int b[]= {1,5,7,8,9};
		for (int i=0; i<b.length;i++)
		{
	    System.out.println(b[i]);//retrive value presence 
	    //Ans:1
	    //5
	    //7
	    //8
	    //9
		}


	}

}
