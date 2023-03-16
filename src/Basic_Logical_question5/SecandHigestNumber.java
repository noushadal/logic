package Basic_Logical_question5;

public class SecandHigestNumber 
{
	
	
	void meth1()
	{
		int arr[]= {10,67,65,98,45};
		
		int largeNumber=0;
		int secandLargeNumber=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>largeNumber)
			{
				largeNumber=secandLargeNumber;
				
				largeNumber=arr[i];
			}
			else if(arr[i]>secandLargeNumber)
			{
				secandLargeNumber=arr[i];
			}
		}
		System.out.println("large number is::"+largeNumber);
		System.out.println("secandLargeNumber is::"+secandLargeNumber);
	}
	
	public static void main(String[] args) 
	{
		
		SecandHigestNumber sh=new SecandHigestNumber();
		
		sh.meth1();
		
	}

}
