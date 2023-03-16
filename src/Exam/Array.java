package Exam;

public class Array 
{
	
	int[] arraysEx(  int num[])
	{
		return  arraysEx(num);
	}
	
	public static void main(String[] args)
	{
		
		//int num[]= {20,30,40,50};
		  
	    Array as=new Array();
	int[] Result= as.arraysEx(new int[] {1,2,3,4});
	
	//System.out.println(Result);
	
	for(int arr:Result)
	{
		System.out.println("data in arrays::"+arr);
	}
	
		
	}

}
