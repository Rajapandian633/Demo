package core_java_14_may_2022;

public class Array_single_dimesion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];//declare an array and allocate
		a[0]=2;
		a[1]=6;
		a[2]=1;
		a[4]=12;
		for (int i=0; i<a.length;i++)
		{
	    System.out.println(a[i]);//retrive value presence 
	    //2 Ans:
	    //6
	    //1
	    //0
	    //12
		}
	
	}

}
