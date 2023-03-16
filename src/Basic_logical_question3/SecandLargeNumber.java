package Basic_logical_question3;

public class SecandLargeNumber 
{
	
	void meth1()
	{
	
	int arr[]= {10,44,76,12,54,98};
	
    int 	largeNumber=0;
	
	int secandlargeNumber=0;
	
	
	for(int i=0; i<=arr.length-1; i++)
	{
		
		if(arr[i]>largeNumber)
		{
			largeNumber=secandlargeNumber;
			
			largeNumber=arr[i];
		}
		
		else if(arr[i]>secandlargeNumber)
		{
			secandlargeNumber=arr[i];
			
		}
		
	}
	System.out.println("large number is::"+largeNumber);
	System.out.println("secandlargeNumber is::"+secandlargeNumber);
	
	
	
	
	}
	public static void main(String[] args) 
	{
		
		SecandLargeNumber sn= new SecandLargeNumber();
		sn.meth1();
		
	}
	
	

}
