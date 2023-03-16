package Basic_logical_question3;

public class largeNumber 
{
	
	void meth1() 
	{
		
		int arr[];
		arr=new int[] {34,78,89,54,35,62,90};
		
	int	largeNumber=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>largeNumber)
			
		{
			largeNumber=arr[i];
			
			
		}
	}
	System.out.println("largeNumber is::"+largeNumber);
		
		
	}
	public static void main(String[] args)
	{
		
		largeNumber ln=new largeNumber();
		ln.meth1();
		
	}

}
